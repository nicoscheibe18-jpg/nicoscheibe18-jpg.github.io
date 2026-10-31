plugins {
    id("com.android.application")
}

android {
    namespace = "de.nico.herzfaenger"
    compileSdk = 35

    defaultConfig {
        applicationId = "de.nico.herzfaenger"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            // Zum einfachen Installieren wird auch die Release-Version mit dem Debug-Schlüssel signiert.
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
