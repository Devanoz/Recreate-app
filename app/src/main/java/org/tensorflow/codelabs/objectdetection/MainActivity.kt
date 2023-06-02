package org.tensorflow.codelabs.objectdetection

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.ContactsContract.Profile
import android.provider.MediaStore
import android.util.Log
import androidx.core.content.FileProvider
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreConstans
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreHelper
import org.tensorflow.codelabs.objectdetection.databinding.ActivityMain2Binding
import org.tensorflow.codelabs.objectdetection.ui.detection.CameraActivity
import org.tensorflow.codelabs.objectdetection.ui.detection.CameraPreview
import org.tensorflow.codelabs.objectdetection.ui.home.HomeFragment
import org.tensorflow.codelabs.objectdetection.ui.login.LoginActivity
import org.tensorflow.codelabs.objectdetection.ui.profile.ProfileFragment
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.Date

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    private lateinit var currentPhotoPath: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.bottomNavigationView.menu.getItem(1).isEnabled = false

        val preferencesDataStoreHelper = PreferencesDataStoreHelper(application)


        lifecycleScope.launch {
            preferencesDataStoreHelper.getPreference(PreferencesDataStoreConstans.TOKEN, "")
                .collect {
                    if (it.isEmpty()) {
                        startActivity(Intent(this@MainActivity, LoginActivity::class.java))
                        finish()
                    }
                }
        }

        binding.fabCamera.setOnClickListener {
            startActivity(Intent(this, CameraPreview::class.java))
        }


//        supportFragmentManager.beginTransaction().replace(R.id.home_fragment_container, HomeFragment()).commit()
//        binding.bottomNavigationView.setOnItemSelectedListener {
//            when(it.itemId) {
//                R.id.home_menu -> {
//                    supportFragmentManager.beginTransaction().replace(R.id.home_fragment_container,HomeFragment()).commit()
//                }
//                R.id.profile_menu -> {
//                    supportFragmentManager.beginTransaction().replace(R.id.home_fragment_container,ProfileFragment()).commit()
//                }
//            }
//            true
//        }
    }

    /**
     * dispatchTakePictureIntent():
     *     Start the Camera app to take a photo.
     */
    private fun dispatchTakePictureIntent() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            // Ensure that there's a camera activity to handle the intent
            takePictureIntent.resolveActivity(packageManager)?.also {
                // Create the File where the photo should go
                val photoFile: File? = try {
                    createImageFile()
                } catch (e: IOException) {
                    Log.e(CameraActivity.TAG, e.message.toString())
                    null
                }
                // Continue only if the File was successfully created
                photoFile?.also {
                    val photoURI: Uri = FileProvider.getUriForFile(
                        this,
                        "org.tensorflow.codelabs.objectdetection.fileprovider",
                        it
                    )
                    takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)
                    startActivityForResult(takePictureIntent, CameraActivity.REQUEST_IMAGE_CAPTURE)
                }
            }
        }
    }

    /**
     * createImageFile():
     *     Generates a temporary image file for the Camera app to write to.
     */
    @Throws(IOException::class)
    private fun createImageFile(): File {
        // Create an image file name
        val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        val storageDir: File? = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile(
            "JPEG_${timeStamp}_", /* prefix */
            ".jpg", /* suffix */
            storageDir /* directory */
        ).apply {
            // Save a file: path for use with ACTION_VIEW intents
            currentPhotoPath = absolutePath
        }
    }
}