// Root build file: declares plugins once so every module uses the same versions.
// AGP 9 has built-in Kotlin support, so Android modules don't apply a separate Kotlin plugin.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.compose.compiler) apply false
}
