object Versions {
    const val kotlin = "1.3.31"

    /** Android versions */
    const val build_tools_version = "29.0.0"
    const val compile_sdk_version = 28
    const val min_sdk_version = 24
    const val target_sdk_version = 28
    const val android_gradle_plugin = "3.5.0-rc01"

    /** Libraries */
    const val androidx = "1.0.2"
    const val constraint_layout = "1.1.3"

    /** Unit tests */
    const val junit = "4.12"

    /** Instrumentation tests */
    const val androidx_junit = "1.1.1"
    const val androidx_espresso = "3.2.0"
}

object Dependencies {
    /** Project dependencies */
    const val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    /** App dependencies */
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val androidx_appcompat = "androidx.appcompat:appcompat:${Versions.androidx}"
    const val androidx_core_ktx = "androidx.core:core-ktx:${Versions.androidx}"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"

    /** Unit tests dependencies */
    const val junit = "junit:junit:${Versions.junit}"

    /** Instrumentation tests dependencies */
    const val androidx_junit = "androidx.test.ext:junit:${Versions.androidx_junit}"
    const val androidx_espresso = "androidx.test.espresso:espresso-core:${Versions.androidx_espresso}"
}