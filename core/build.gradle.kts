import com.uratxe.movetilt.Android
import com.uratxe.movetilt.AndroidX
import com.uratxe.movetilt.Firebase
import com.uratxe.movetilt.Libs

plugins {
    id("com.android.library")
    id("com.google.gms.google-services")
    kotlin("android")
    kotlin("android.extensions")
    id("kotlin-android-extensions")
    id("androidx.navigation.safeargs.kotlin")
}


android {
    compileSdkVersion(Android.compiledSdk)
    buildToolsVersion = Android.buildToolsVersion
    defaultConfig {
        minSdkVersion(Android.minSdk)
        targetSdkVersion(Android.targetSdk)
        versionCode = Android.versionCode
        versionName = Android.versionName
    }



    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }


    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    sourceSets{
        this["main"].java.srcDir("src/main/kotlin")
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}


dependencies {
    //implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.61")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.0-beta4")

    testImplementation("junit:junit:4.13")
    androidTestImplementation("androidx.test.ext:junit:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")

    implementation("com.google.firebase:firebase-core:17.2.2")

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")
    // For Kotlin use lifecycle-viewmodel-ktx

    implementation("androidx.lifecycle:lifecycle-common-java8:2.2.0")

    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.2.0")

    implementation("org.koin:koin-android-viewmodel:${Libs.koin}")
    implementation("org.koin:koin-android-scope:${Libs.koin}")


    implementation("androidx.navigation:navigation-fragment-ktx:2.2.1")
    implementation("androidx.navigation:navigation-ui-ktx:2.2.1")

    implementation("com.google.android.material:material:1.1.0")

    implementation("com.github.bumptech.glide:glide:4.11.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.11.0")



    implementation ("androidx.ui:ui-tooling:0.1.0-dev04")
    implementation ("androidx.ui:ui-layout:0.1.0-dev04")
    implementation ("androidx.ui:ui-material:0.1.0-dev04")

    implementation ("com.squareup.retrofit2:retrofit:2.7.1")
    implementation ("com.squareup.retrofit2:converter-gson:2.7.1")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.0.0")

    implementation ("joda-time:joda-time:2.10.4")




}
