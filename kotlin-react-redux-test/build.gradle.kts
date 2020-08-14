plugins {
    kotlin("js")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-js"))

    //React, React DOM + Wrappers (chapter 3)
    implementation(React.react)
    implementation(React.reactDom)
    implementation(React.reactRedux)
    implementation(React.reactRouter)

/*
    implementation(npm("react", Versions.npmReact))
    implementation(npm("react-dom", Versions.npmReact))
    implementation(npm("react-router-dom", Versions.npmReactRouter))
    implementation(npm("react-redux", Versions.npmReactRedux))
    implementation(npm("redux", Versions.npmRedux))
*/
    //Kotlin Styled (chapter 3)
    implementation(Kotlin.styled)

    //implementation(npm("styled-components", Versions.npmStyledComponents))
    //implementation(npm("inline-style-prefixer", Versions.npmInlineStylePrefixer))

    //Video Player (chapter 7)
    //implementation(npm("react-player", Versions.npmReactPlayer))

    //Share Buttons (chapter 7)
    //implementation(npm("react-share", Versions.npmReactShare))

    //Coroutines (chapter 8)
    implementation(Kotlinx.ktxCoroutinesCore)

    testImplementation(Kotlin.test)
    testImplementation(Kotlin.testJs)
    testImplementation(Kotlin.testAnnotations)

}

// Heroku Deployment (chapter 9)
tasks.register("stage") {
    dependsOn("build")
}


kotlin {
    js {
        browser {
            useCommonJs()
            binaries.executable()
            webpackTask {
                cssSupport.enabled = true
                sourceMaps = true
            }
            runTask {
                cssSupport.enabled = true
            }
            testTask {
                useKarma {
                    useChromeHeadless()
                    webpackConfig.cssSupport.enabled = true
                }
            }
        }
    }
}