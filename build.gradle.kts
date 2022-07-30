plugins {
    kotlin("jvm") version "1.6.20"
    java
}



repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

allprojects {
    group = "com.wanna"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
        jcenter()
        google()
        mavenLocal()
    }

    apply {
        plugin("java")
        plugin("maven-publish")
        plugin("kotlin")
    }

    dependencies {
        implementation("com.google.guava:guava:31.1-jre")
        implementation("org.springframework.boot:spring-boot-starter-actuator:2.5.14")
        implementation("org.springframework.boot:spring-boot-starter-web:2.5.14")
        implementation("org.apache.dubbo:dubbo-spring-boot-starter:2.7.15")
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}