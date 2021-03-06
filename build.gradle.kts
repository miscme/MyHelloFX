plugins {
    application
    id("org.openjfx.javafxplugin") version "0.0.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("HelloFX")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

javafx {
    version = "16"
    modules("javafx.controls", "javafx.fxml")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}