plugins {
    id("starter.android.feature")
}

android {
    namespace = "com.example.pandora.feature.home"
}

dependencies {
    implementation(project(":core:designsystem"))
    implementation(project(":core:domain"))
    implementation(project(":core:model"))

    testImplementation(project(":core:testing"))
}
