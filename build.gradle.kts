plugins {
    kotlin("multiplatform") version "1.7.0"
    id("maven-publish")
    id("signing")
}

group = "io.github.edgeatzero"
version = "1.0.1-SNAPSHOT"

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
                username = properties["sonatypeUsername"] as String
                password = properties["sonatypePassword"] as String
            }
        }
    }
    publications {
        withType<MavenPublication> {
            groupId = "io.github.edgeatzero"
            artifactId = "BookSource-api"
            version = project.version.toString()
            pom {
                name.set("Edge Reader Source Api")
                description.set("edge reader core source api")
                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://github.com/EdgeAtZero/BookSource-api/blob/master/LICENSE")
                    }
                }
                issueManagement {
                    system.set("Github")
                    url.set("https://github.com/EdgeAtZero/BookSource-api/issues")
                }
                scm {
                    connection.set("https://github.com/EdgeAtZero/BookSource-api.git")
                    url.set("https://github.com/EdgeAtZero/BookSource-api")
                }
                developers {
                    developer {
                        name.set("Edge At Zero")
                        email.set("edgeatzero@gmail.com")
                    }
                }
            }
        }
    }
}