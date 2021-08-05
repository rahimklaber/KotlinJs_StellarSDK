plugins {
    kotlin("js") version "1.5.21"
}

group = "me.rahim"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(npm("stellar-sdk","8.2.5"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
}

kotlin {
    js(IR) {
        binaries.executable()
        nodejs {
            
        }
    }
}