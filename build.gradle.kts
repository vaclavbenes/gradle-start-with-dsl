subprojects {

    apply(from = rootProject.file("gradle/licensing.gradle"))
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    dependencies {
        val implementation by configurations
        implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        implementation("com.google.guava:guava:31.1-jre")

        "testImplementation"("org.junit.jupiter:junit-jupiter-api:5.8.1")
        "testRuntimeOnly"("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    }

    tasks {
        named<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>("compileKotlin") {
            kotlinOptions {
                allWarningsAsErrors = true
            }
        }
    }
}
