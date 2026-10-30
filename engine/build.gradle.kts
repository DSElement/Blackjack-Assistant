import org.jetbrains.kotlin.gradle.dsl.JvmTarget

// The engine is pure Kotlin (no Android, no java.* APIs) so the same code can later
// be compiled for the web (a js() target) without being rewritten.
plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    jvm {
        compilerOptions {
            // Matches the Android app's Java level so the app can use this module directly.
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }
}
