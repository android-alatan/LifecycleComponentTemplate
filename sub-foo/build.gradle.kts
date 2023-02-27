plugins {
    id("lib-kotlin-android")
    id("lib-compose")
    kotlin("kapt")
}

android {
    namespace = "io.androidalatan.lifecycle.template.foobar.sub.foo"
}

dependencies {

    implementation(libs.compose.material)
    implementation(libs.compose.runtimeLiveData)

    implementation(libs.alatan.lifecycle.router.api)
    implementation(libs.alatan.lifecycle.compose.holder)
    implementation(libs.alatan.lifecycle.handler.api)
    implementation(libs.alatan.lifecycle.handler.annotation)
    implementation(libs.alatan.lifecycle.handler.composeutil)
    implementation(libs.alatan.lifecycle.viewevent.compose.ext.api)
    implementation(libs.alatan.lifecycle.viewevent.api)
    implementation(libs.alatan.lifecycle.viewevent.flow)
    implementation(libs.alatan.lifecycle.resulthandler.api)

    implementation(libs.dagger.android)
    implementation(libs.dagger.base)
    implementation(libs.common.javaX)
    kapt(libs.dagger.androidCompiler)
    kapt(libs.dagger.baseCompiler)

}