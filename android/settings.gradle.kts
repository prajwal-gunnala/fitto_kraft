pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    val flutterSdkPath = File(rootDir.parentFile, "flutter").absolutePath
    includeBuild("$flutterSdkPath/packages/flutter_tools/gradle")
}

rootProject.name = "fitto_kraft"
include(":app")

plugins {
    id("dev.flutter.flutter-plugin-loader") version "1.0.0"
    id("com.android.application") version "8.7.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.22" apply false
}

include(":app")
