plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

// kotlin("jvm") is loaded from this `buildSrc` build file.
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0")
}
