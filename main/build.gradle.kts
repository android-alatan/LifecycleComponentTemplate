plugins {
    id("lib-kotlin-android")
    id("lib-compose")
    kotlin("kapt")
}

android {
    namespace = "io.androidalatan.lifecycle.template.main"
}

dependencies {
    implementation(projects.foobarApi)

    implementation(libs.alatan.lifecycle.dagger.composeactivity)
    implementation(libs.alatan.lifecycle.dagger.scope)
    implementation(libs.alatan.lifecycle.compose.holder)
    implementation(libs.alatan.lifecycle.handler.api)
    implementation(libs.alatan.lifecycle.viewevent.flow)
    implementation(libs.alatan.alerts.common.dialog.api)
    implementation(libs.alatan.resourceprovider.api)

    implementation(libs.dagger.android)
    implementation(libs.dagger.base)
    implementation(libs.common.javaX)
    kapt(libs.dagger.androidCompiler)
    kapt(libs.dagger.baseCompiler)

    implementation(libs.compose.material)
    implementation(libs.compose.runtimeLiveData)

    testImplementation(libs.alatan.lifecycle.handler.assertion)
    testImplementation(libs.alatan.lifecycle.viewevent.assertion)
    testImplementation(libs.alatan.lifecycle.router.assertion)
    testImplementation(libs.test.turbine)
    testImplementation(libs.test.coroutineTest)
}