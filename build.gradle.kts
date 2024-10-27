
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id 'com.android.application'
    id 'kotlin-android'
    id 'kotlin-kapt'
    id 'kotlin-parcelize'
    id 'androidx.navigation.safeargs.kotlin'
}

dependencies{
    val room_version = "2.6.1"
    implementation "androidx.room:room-ktx:$room_version"
    kapt "androidx.room:room-compiler:$room_version"
    androidTestImplementation "androidx.room:room-testing:$room_version"

}




