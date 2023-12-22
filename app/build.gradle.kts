plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
    id("com.google.gms.google-services")
    id("com.google.dagger.hilt.android")
    kotlin("kapt")
}

android {
    namespace = "com.nexis.shopsmart"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.nexis.shopsmart"
        minSdk = 30
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures{
        viewBinding = true
        buildConfig = true
    }

    kapt{
        correctErrorTypes = true
    }
}

dependencies {
    val room_version = "2.6.1"
    val lottieVersion = "3.4.0"


    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment:2.7.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.5")
    implementation(platform("com.google.firebase:firebase-bom:32.6.0"))
    implementation("com.google.firebase:firebase-database:20.3.0")
    implementation("com.google.firebase:firebase-storage")

    implementation("com.android.support:support-annotations:28.0.0")
//    implementation("android.arch.persistence.room:runtime:1.1.1")
    annotationProcessor("android.arch.persistence.room:compiler:1.1.1")
    androidTestImplementation("android.arch.persistence.room:testing:1.1.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("com.google.dagger:hilt-android:2.42")
    kapt("com.google.dagger:hilt-android-compiler:2.42")

    // room
    implementation("androidx.room:room-runtime:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")
    kapt("androidx.room:room-compiler:$room_version")
    implementation("androidx.room:room-ktx:$room_version")
    implementation("androidx.room:room-rxjava2:$room_version")
    implementation("androidx.room:room-rxjava3:$room_version")
    implementation("androidx.room:room-guava:$room_version")
    testImplementation("androidx.room:room-testing:$room_version")
    implementation("androidx.room:room-paging:$room_version")

    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")

    implementation("com.airbnb.android:lottie:$lottieVersion")

    implementation("com.github.bumptech.glide:glide:4.16.0")

    //Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")

    //GSON
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
}


