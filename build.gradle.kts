
plugins {
    application
}

repositories {
    mavenCentral()
    flatDir {
        dirs ("lib")
    }
}

dependencies {
    implementation("jcp:JCP:2.0.41789")
}
