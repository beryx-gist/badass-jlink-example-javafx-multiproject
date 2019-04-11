plugins {
    `application`
    id("org.openjfx.javafxplugin") version "0.0.7"
    id("org.beryx.jlink") version "2.9.5"
}

dependencies {
    compile(project(":greeter-impl"))
}

javafx {
    modules = listOf("javafx.controls")
}

application {
    mainClassName = "org.example.gui/org.example.gui.HelloFX"
}

jlink {
    addOptions("--bind-services", "--strip-debug", "--compress", "2", "--no-header-files", "--no-man-pages")
    if("true".equals(System.getenv("CI"))) {
        listOf("win", "linux", "mac").forEach { name ->
            targetPlatform(name) {
                jdkHome = System.getenv("JDK_HOME_" + name.toUpperCase())
                addExtraModulePath(System.getenv("OPENJFX_MODS_" + name.toUpperCase()))
            }
        }
    }
    launcher {
        name = "helloFX"
    }
}
