import org.jetbrains.changelog.Changelog

plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.13.3" // https://github.com/JetBrains/gradle-intellij-plugin
    id("org.jetbrains.changelog") version "2.0.0" // https://github.com/JetBrains/gradle-changelog-plugin
}

// Import variables from gradle.properties file
val pluginIdeaVersion: String by project
val pluginDownloadIdeaSources: String by project
val pluginInstrumentPluginCode: String by project
val pluginJavaVersion: String by project
val version: String by project

group = "lermitage.intellij.extratci"

repositories {
    mavenCentral()
}

intellij {
    downloadSources.set(pluginDownloadIdeaSources.toBoolean() && !System.getenv().containsKey("CI"))
    instrumentCode.set(true)
    pluginName.set("Extra Toolwindow Colorful Icons")
    updateSinceUntilBuild.set(false)
    version.set(pluginIdeaVersion)
}

changelog {
    headerParserRegex.set("(.*)".toRegex())
    itemPrefix.set("*")
}

tasks {
    withType<JavaCompile> {
        sourceCompatibility = pluginJavaVersion
        targetCompatibility = pluginJavaVersion
        options.compilerArgs = listOf("-Xlint:deprecation")
        options.encoding = "UTF-8"
    }
    runIde {
        autoReloadPlugins.set(false)
    }
    buildSearchableOptions {
        enabled = false
    }
    patchPluginXml {
        changeNotes.set(provider {
            with(changelog) {
                renderItem(getLatest(), Changelog.OutputType.HTML)
            }
        })
    }
}
