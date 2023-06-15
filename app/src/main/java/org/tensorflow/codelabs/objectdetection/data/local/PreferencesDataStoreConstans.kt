package org.tensorflow.codelabs.objectdetection.data.local


import androidx.datastore.preferences.core.stringPreferencesKey

object PreferencesDataStoreConstans {
    val USER_ID = stringPreferencesKey("USER_ID")
    val USERNAME = stringPreferencesKey("NAME")
    val EMAIL = stringPreferencesKey("EMAIL")
    val PROFILE_URL = stringPreferencesKey("PROFILE_URL")
    val TOKEN = stringPreferencesKey("TOKEN")
    val JOINED_AT = stringPreferencesKey("JOINED_AT")
}