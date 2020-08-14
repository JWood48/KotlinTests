
object Versions {

    const val klock = "2.0.0-alpha-2"
    //const val klock = "1.11.13"

    const val kotlin = "1.4.0-rc"
    //const val kotlin = "1.3.72"
    //const val kotlinCoroutines = "1.3.8-native-mt-1.4.0-rc"
    const val kotlinCoroutines = "1.3.8-$kotlin"
    const val kotlinxDateTime = "0.1.0"
    //const val kotlinCoroutines = "1.3.8"
    const val ktor = "1.3.2-$kotlin"
    const val kotlinxSerialization = "1.0-M1-$kotlin"
    //const val kotlinxSerialization = "0.20.0"

    const val koin = "3.0.0-alpha-2"
    const val slf4j = "1.7.30"
    const val ktx = "1.0.1"
    const val nav = "2.1.0-alpha04"
    const val work = "2.1.0-alpha02"
    const val lifecycle = "2.2.0-alpha01"
    const val fragment = "1.1.0-alpha09"
    const val compose = "0.1.0-dev16"
    const val coilVersion = "0.1.6"

    const val react = "16.13.1-pre.110-kotlin-${Versions.kotlin}"
    const val reactRedux = "5.0.7-pre.110-kotlin-${Versions.kotlin}"
    const val redux = "4.0.0-pre.110-kotlin-${Versions.kotlin}"
    const val reactRouter = "5.1.2-pre.110-kotlin-${Versions.kotlin}"

    const val ktStyled = "1.0.0-pre.109-kotlin-${Versions.kotlin}"
    const val ktHtmlJs = "1.0.0-pre.109-kotlin-${Versions.kotlin}"
    const val mvikotlin = "2.0.0-rc2"


    const val npmReact = "16.13.1"
    const val npmStyledComponents = "4.3.2"
    const val npmInlineStylePrefixer = "5.1.0"
    const val npmReactShare = "4.2.1"
    const val npmReactPlayer = "2.6.0"
    const val npmReactRedux = "5.0.7"
    const val npmReactRouter = "5.1.2"
    const val npmRedux = "4.0.3"


    const val junit = "4.12"
    const val coreTesting = "2.0.0"
    const val coroutinesTest = "1.1.0"
}

object Ktor {

    const val serverNetty = "io.ktor:ktor-server-netty:${Versions.ktor}"
    const val htmlBuilder = "io.ktor:ktor-html-builder:${Versions.ktor}"

    const val clientCore = "io.ktor:ktor-client-core:${Versions.ktor}"
    const val clientJson = "io.ktor:ktor-client-json:${Versions.ktor}"
    const val clientLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
    const val clientSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"

    const val clientEngineJs = "io.ktor:ktor-client-js:${Versions.ktor}"
    const val clientEngineCio = "io.ktor:ktor-client-cio:${Versions.ktor}"

}


object Kotlin {
    const val styled = "org.jetbrains:kotlin-styled:${Versions.ktStyled}"
    const val htmlJs = "org.jetbrains:kotlinx-html-js:${Versions.ktHtmlJs}"


    const val test = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
    const val testAnnotations = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"


    const val testJs = "org.jetbrains.kotlin:kotlin-test-js:${Versions.kotlin}"
    const val testJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"





}
object Kotlinx {
    const val ktxSerializationRuntime = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.kotlinxSerialization}"
    const val ktxCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
    const val ktxCoroutinesJdk8 = "org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:${Versions.kotlinCoroutines}"
    const val ktxCoroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinCoroutines}"
    const val ktxCoroutinesDateTime = "org.jetbrains.kotlinx:kotlinx-datetime:${Versions.kotlinxDateTime}"


}

object React {
    const val react = "org.jetbrains:kotlin-react:${Versions.react}"
    const val reactDom = "org.jetbrains:kotlin-react-dom:${Versions.react}"
    const val reactRedux = "org.jetbrains:kotlin-react-redux:${Versions.reactRedux}"
    const val redux = "org.jetbrains:kotlin-redux:${Versions.redux}"
    const val reactRouter = "org.jetbrains:kotlin-react-router-dom:${Versions.reactRouter}"
}
object Klock {
    const val klock = "com.soywiz.korlibs.klock:klock:${Versions.klock}"

}


object MviKotlin {
    const val mvikotlin = "com.arkivanov.mvikotlin:mvikotlin:${Versions.mvikotlin}"
    const val mvikotlinMain = "com.arkivanov.mvikotlin:mvikotlin-main:${Versions.mvikotlin}"
    const val mvikotlinLogging = "com.arkivanov.mvikotlin:mvikotlin-logging:${Versions.mvikotlin}"
    const val mvikotlinTimetravel = "com.arkivanov.mvikotlin:mvikotlin-timetravel:${Versions.mvikotlin}"
    const val mvikotlinExtReaktive = "com.arkivanov.mvikotlin:mvikotlin-extensions-reaktive:${Versions.mvikotlin}"
    const val mvikotlinExtCoroutines = "com.arkivanov.mvikotlin:mvikotlin-extensions-coroutines:${Versions.mvikotlin}"
    const val mvikotlinExtAndroidx = "com.arkivanov.mvikotlin:mvikotlin-extensions-androidx:${Versions.mvikotlin}"
    const val mvikotlinRx = "com.arkivanov.mvikotlin:rx:${Versions.mvikotlin}"

}


object Jetbrains {
    object Kotlin : Group(name = "org.jetbrains.kotlin") {
        private const val version = Versions.kotlin

        object Plugin {
            object Gradle : Dependency(group = Kotlin, name = "kotlin-gradle-plugin", version = version)
        }

        object StdLib {
            object Common : Dependency(group = Kotlin, name = "kotlin-stdlib-common", version = version)
            object Jdk7 : Dependency(group = Kotlin, name = "kotlin-stdlib-jdk7", version = version)
            object Js : Dependency(group = Kotlin, name = "kotlin-stdlib-js", version = version)
        }

        object Reflect : Dependency(group = Kotlin, name = "kotlin-reflect", version = version)

        object Test {
            object Common : Dependency(group = Kotlin, name = "kotlin-test-common", version = version)
            object Js : Dependency(group = Kotlin, name = "kotlin-test-js", version = version)
            object Junit : Dependency(group = Kotlin, name = "kotlin-test-junit", version = version)
        }

        object TestAnnotations {
            object Common : Dependency(group = Kotlin, name = "kotlin-test-annotations-common", version = version)
        }
    }

    object Kotlinx : Group(name = "org.jetbrains.kotlinx") {
        object Coroutines {
            private const val version = Versions.kotlinCoroutines

            object Core : Dependency(group = Kotlinx, name = "kotlinx-coroutines-core", version = version) {
                object Common : Dependency(group = Kotlinx, name = "kotlinx-coroutines-core-common", version = version)
                object Native : Dependency(group = Kotlinx, name = "kotlinx-coroutines-core-native", version = version)
                object Js : Dependency(group = Kotlinx, name = "kotlinx-coroutines-core-js", version = version)
            }

            object Android : Dependency(group = Kotlinx, name = "kotlinx-coroutines-android", version = version)
        }
    }
}


object Badoo {
    object Reaktive : Group(name = "com.badoo.reaktive") {
        private const val version = "1.1.14"

        object Reaktive : Dependency(group = Badoo.Reaktive, name = "reaktive", version = version)
        object ReaktiveAnnotations : Dependency(group = Badoo.Reaktive, name = "reaktive-annotations", version = version)
        object ReaktiveTesting : Dependency(group = Badoo.Reaktive, name = "reaktive-testing", version = version)
        object Utils : Dependency(group = Badoo.Reaktive, name = "utils", version = version)
    }
}

object Logging {

    const val slf4j = "org.slf4j:slf4j-api:1.7.26"
    const val logbackCore = "ch.qos.logback:logback-core:1.2.3"
    const val logbackClassic = "ch.qos.logback:logback-classic:1.2.3"



}



object Compose {
    const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val uiGraphics = "androidx.compose.ui:ui-graphics:${Versions.compose}"
    const val uiTooling = "androidx.ui:ui-tooling:${Versions.compose}"
    const val foundationLayout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"
    const val runtimeLiveData =  "androidx.compose.runtime:runtime-livedata:${Versions.compose}"

}

object Koin {
    val core = "org.koin:koin-core:${Versions.koin}"
    val android = "org.koin:koin-android:${Versions.koin}"
    val androidViewModel = "org.koin:koin-android-viewmodel:${Versions.koin}"
}

open class Group(val name: String)

open class Dependency private constructor(
    private val notation: String
) : CharSequence by notation {
    constructor(group: Group, name: String, version: String) : this("${group.name}:$name:$version")

    override fun toString(): String = notation
}
