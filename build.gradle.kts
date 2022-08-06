import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    `maven-publish`
    signing
}

group = "io.github.edgeatzero"
version = "1.0.5-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")
    implementation("io.ktor:ktor-client-core:2.0.3")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "11"
    }
    test {
        useJUnitPlatform()
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
        create<MavenPublication>("Maven") {
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

                from(components["kotlin"])
            }
        }
    }
}