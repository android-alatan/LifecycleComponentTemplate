plugins {
    id("lib-kotlin-android")
    id("lib-compose")
    kotlin("kapt")
}

android {
    namespace = "io.androidalatan.lifecycle.template.foobar"
}

dependencies {
    implementation(projects.foobarApi)
    implementation(projects.subFoo)
    implementation(projects.subBar)

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
//    implementation(libs.androidx.nav.compose)
//
//    testImplementation(libs.alatan.lifecycle.handler.assertion)
//    testImplementation(libs.alatan.lifecycle.viewevent.assertion)
//    testImplementation(libs.alatan.lifecycle.router.assertion)
//    testImplementation(libs.alatan.preferences.builder)
}