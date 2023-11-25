plugins {
    alias(libs.plugins.android.application)
    kotlin("android")
    alias(libs.plugins.jetbrains.compose)
}

android {
    namespace = "com.plcoding.contactscomposemultiplatform.android"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.plcoding.contactscomposemultiplatform.android"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.4"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(project(":shared"))
    implementation(libs.ui)
    implementation(libs.ui.tooling)
    implementation(libs.ui.tooling.preview)
    implementation("androidx.compose.foundation:foundation:1.5.4")
    implementation(libs.material.compose)
    implementation(libs.activity.compose)
}