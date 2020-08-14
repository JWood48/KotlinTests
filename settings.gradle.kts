enableFeaturePreview("GRADLE_METADATA")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven {
            url = uri("https://dl.bintray.com/kotlin/kotlin-eap")
        }
    }
    
}


include("kotlin-react-redux-test")



