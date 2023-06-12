package org.tensorflow.codelabs.objectdetection.util

import android.util.Log
import java.text.SimpleDateFormat
import java.util.Locale

object DateUtils {
     fun formatDate(timeStamp: String): String {
        val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        val outputFormat = SimpleDateFormat("dd MMMM yyyy", Locale.getDefault())

        val date = inputFormat.parse(timeStamp)
        if (date != null) {
            Log.d("myLogDate",date.toString())
        }
        return outputFormat.format(date!!)
    }
}