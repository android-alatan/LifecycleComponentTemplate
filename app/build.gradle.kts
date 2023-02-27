plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = "io.androidalatan.lifecycle.template"
    compileSdk = libs.versions.androidCompile.get().toInt()
    buildToolsVersion = libs.versions.androidBuildTool.get()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        multiDexEnabled = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
}

afterEvaluate {
    android.applicationVariants.forEach { variant ->
        kotlin.sourceSets {
            val name = variant.name
            getByName(name) {
                kotlin.srcDir("$buildDir/generated/ksp/$name/kotlin")
            }
        }
    }
}

dependencies {

    implementation(libs.androidx.compat)
    implementation(libs.androidx.multidex)

    implementation(libs.google.material)

    implementation(libs.compose.ui)
    implementation(libs.compose.runtime)
    implementation(libs.compose.runtimeLiveData)
    implementation(libs.compose.material)

    implementation(libs.alatan.preferences.annotation)
    implementation(libs.alatan.preferences.api)
    implementation(libs.alatan.preferences.builder)

    implementation(libs.alatan.lifecycle.handler.impl)
    implementation(libs.alatan.lifecycle.resulthandler.impl)
    implementation(libs.alatan.lifecycle.bundlecollector.impl)
    implementation(libs.alatan.lifecycle.requestpermission.impl)
    implementation(libs.alatan.lifecycle.backkeyhandler.impl)
    implementation(libs.alatan.lifecycle.viewevent.impl)
    implementation(libs.alatan.lifecycle.router.impl)
    implementation(libs.alatan.lifecycle.handler.invoker.api)
    implementation(libs.alatan.lifecycle.handler.annotation)
    implementation(libs.alatan.lifecycle.compose.activator)
    implementation(libs.alatan.lifecycle.compose.holder)

    implementation(libs.alatan.lifecycle.lazyprovider)
    implementation(libs.alatan.lifecycle.coroutine)
    implementation(libs.alatan.lifecycle.handler.invoker.api)
    implementation(libs.alatan.lifecycle.handler.invoker.flow)

    implementation(libs.alatan.lifecycle.dagger.composeactivity)
    implementation(libs.alatan.lifecycle.dagger.basebuilder)
    implementation(libs.alatan.lifecycle.dagger.scope)

    implementation(libs.alatan.resourceprovider.impl)
    implementation(libs.alatan.alerts.compose.dialog.impl)
    implementation(libs.alatan.alerts.common.dialog.impl)

    implementation(libs.alatan.preferences.annotation)
    implementation(libs.alatan.preferences.api)
    implementation(libs.alatan.preferences.builder)


    implementation(libs.common.javaX)
    implementation(libs.dagger.base)
    implementation(libs.dagger.android)
    kapt(libs.dagger.baseCompiler)
    kapt(libs.dagger.androidCompiler)


    projects::class.java.declaredMethods.filter {
        it.name.startsWith("get") && org.gradle.api.internal.catalog.DelegatingProjectDependency::class.java.isAssignableFrom(
            it.returnType
        )
    }.map { it.invoke(projects) as org.gradle.api.internal.catalog.DelegatingProjectDependency }
        .filter { projectModule ->
            projectModule.name != project.name &&
                    projectModule.name != rootProject.name &&
                    !projectModule.name.contains("test", true)
        }
        .forEach { projectModule ->
            implementation(projectModule)
        }
}