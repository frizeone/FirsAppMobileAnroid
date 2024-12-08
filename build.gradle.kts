// Корневой файл build.gradle.kts
plugins {
    id("com.android.application") version "8.6.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    // Удалите `androidx.navigation.safeargs.kotlin` здесь
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3") // Добавляем зависимость для Safe Args
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
