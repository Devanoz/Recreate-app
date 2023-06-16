package org.tensorflow.codelabs.objectdetection.data.repository

import android.app.Application
import android.content.ContentResolver
import android.content.Context
import android.net.Uri
import android.os.Environment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreConstans
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreHelper
import org.tensorflow.codelabs.objectdetection.data.network.ApiConfig
import org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.UploadProfileResponse
import retrofit2.Response
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.io.OutputStream
import java.text.SimpleDateFormat
import java.util.Locale


class ProfileRepository(private val context: Context) {
    private val token = runBlocking {
        PreferencesDataStoreHelper(context).getFirstPreference(PreferencesDataStoreConstans.TOKEN,"")
    }
    private val client = ApiConfig.getApiServiceWithToken(token)


    private val timeStamp: String = SimpleDateFormat(
        FILENAME_FORMAT,
        Locale.US
    ).format(System.currentTimeMillis())


    suspend fun getProfileData() = client.getProfileData()

    suspend fun logout() {
        withContext(Dispatchers.IO) {
            PreferencesDataStoreHelper(context).clearAllPreference()
        }
    }

    suspend fun uploadProfile(userId: String,profileUri: Uri): Response<UploadProfileResponse> {
        val file = uriToFile(profileUri,context as Application)
        val image = file.asRequestBody("image/*".toMediaTypeOrNull())
        val imagePart = MultipartBody.Part.createFormData("files",file.name,image)

        val formMap = HashMap<String,RequestBody>()
        formMap["refId"] = userId.toRequestBody("text/plain".toMediaTypeOrNull())
        formMap["ref"] = "plugin::users-permissions.user".toRequestBody("text/plain".toMediaTypeOrNull())
        formMap["field"] = "avatar".toRequestBody("text/plain".toMediaTypeOrNull())

        return client.uploadUserPhoto(imagePart,formMap)
    }

    private fun uriToFile(selectedImg: Uri, application: Application): File {
        val contentResolver: ContentResolver = application.contentResolver
        val myFile = createCustomTempFile(application)

        val inputStream = contentResolver.openInputStream(selectedImg) as InputStream
        val outputStream: OutputStream = FileOutputStream(myFile)
        val buf = ByteArray(1024)
        var len: Int
        while (inputStream.read(buf).also { len = it } > 0) outputStream.write(buf, 0, len)
        outputStream.close()
        inputStream.close()

        return myFile
    }

    private fun createCustomTempFile(application: Application): File {
        val storageDir: File? = application.getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile(timeStamp, ".jpg", storageDir)
    }

    companion object {
        private const val FILENAME_FORMAT = "dd-MMM-yyyy"
    }

}