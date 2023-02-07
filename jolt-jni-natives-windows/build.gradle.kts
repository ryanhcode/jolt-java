plugins {
    id("java")
}

val jvmVersion = ext.get(JVM_VERSION) as Int
val bindings = projects.joltJniBindingsCpp.dependencyProject

dependencies {
    implementation(projects.joltJni)
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(jvmVersion))
}

tasks {
    jar {
        val jarTask = this
        bindings.tasks.withType<LinkSharedLibrary> {
            jarTask.mustRunAfter(this)
        }

        from("${bindings.buildDir}/lib/main/debug/jolt-jni-bindings-cpp.dll") {
            into("jolt/")
        }
    }
}
