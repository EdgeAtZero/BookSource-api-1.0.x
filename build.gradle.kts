plugins {
    kotlin("multiplatform") version "1.7.0"
    id("maven-publish")
    signing
}

group = "io.github.edgeatzero"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                compileOnly("io.ktor:ktor-client-core:2.0.2")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting
    }
}

signing {
    sign(publishing.publications)
}

publishing {
    repositories {
        maven {
            name = "sonatype"
            if (version.toString().endsWith("SNAPSHOT")) {
                setUrl("https://s01.oss.sonatype.org/content/repositories/snapshots/")
            } else {
                setUrl("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            }
            credentials {
                username = properties["ossrhUsername"] as String
                password = properties["ossrhPassword"] as String
            }
        }
    }
    publications {
        withType<MavenPublication> {
            pom {
                packaging = "io.github.edgeatzero.reader.api"
                name.set("Reader-Api")
                scm {
                    connection.set("https://github.com/EdgeAtZero/EdgeReaderApi.git")
                    url.set("https://github.com/EdgeAtZero/EdgeReaderApi")
                }
            }
        }
    }
}