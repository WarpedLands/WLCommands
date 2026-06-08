plugins {
    `java-library`
    id("io.papermc.paperweight.userdev") version "2.0.0-beta.19"
    id("xyz.jpenilla.run-paper") version "3.0.2"
    id("com.gradleup.shadow") version "8.3.5"
}

group = "com.warpedlands"
version = "1.0"

java {
    toolchain.languageVersion = JavaLanguageVersion.of(21)
}

repositories {
    mavenCentral()
}

dependencies {
    paperweight.paperDevBundle("1.21.10-R0.1-SNAPSHOT")
    implementation("org.reflections:reflections:0.10.2")
}

tasks {
    compileJava {
        options.release = 21
    }

    javadoc {
        options.encoding = Charsets.UTF_8.name()
    }

    shadowJar {
        archiveClassifier.set("")

        // Merge service files (helps with Guice)
        mergeServiceFiles()

        // Append any additional configuration if needed
        // Relocate is optional - try without it first
        // relocate("com.google.inject", "me.alexxxychep.libs.guice")
    }

    // Make the build task depend on shadowJar
    build {
        dependsOn(shadowJar)
    }

    // For Paperweight compatibility
    reobfJar {
        inputJar.set(shadowJar.flatMap { it.archiveFile })
    }
}

tasks.test {
    useJUnitPlatform()
}
