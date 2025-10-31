plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.lab08"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.lab08"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    testOptions {
        unitTests {
            all {
                it.useJUnitPlatform()
            }
        }
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)

    testImplementation(platform("org.junit:junit-bom:5.10.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    testImplementation("junit:junit:4.13.2")
    
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
