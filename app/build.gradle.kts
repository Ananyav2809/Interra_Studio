plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.interrastudio"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.interrastudio"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // RecyclerView (budget feature ke liye)
    implementation("androidx.recyclerview:recyclerview:1.3.2")

}