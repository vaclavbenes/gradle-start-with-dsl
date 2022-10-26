plugins {
    application
}

application {
    mainClass.set("MainKt")
}

dependencies {
    implementation(project(":core"))
}

licensing {
    withGroovyBuilder {
        "license"("LGPL")
    }
}
