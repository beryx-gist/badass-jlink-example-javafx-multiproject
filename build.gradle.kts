plugins {
    id("org.javamodularity.moduleplugin") version "1.5.0"
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "org.javamodularity.moduleplugin")

    repositories {
        jcenter()
    }
}
