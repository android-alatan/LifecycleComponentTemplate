plugins {
    kotlin("jvm")
    id("code-quality")
    id("libs-detekt")
    id("lib-tasks")
}

val versionCatalog = project.extensions.getByType<VersionCatalogsExtension>()
val libs = versionCatalog.named("libs")

dependencies {
    testImplementation(libs.findLibrary("test.junit5").get())
    testImplementation(libs.findLibrary("test.mockito").get())
    testImplementation(libs.findLibrary("test.mockitoKotlin").get())
    testRuntimeOnly(libs.findLibrary("test.jupiterEngine").get())
    testRuntimeOnly(libs.findLibrary("test.jupiterVintage").get())
}