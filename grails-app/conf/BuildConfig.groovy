grails.project.work.dir = 'target'

grails.project.docs.output.dir = "docs"

// Plugin Publishing Repository Information
grails.project.repos.umnNcs.url = "http://artifact.ncs.umn.edu/plugins-release-local"
grails.project.repos.umnNcs.type = "maven"
grails.project.repos.default = "umnNcs"
grails.release.scm.enabled = false

grails.project.dependency.resolution = {

    inherits "global"
    log "warn"

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()
    }

    plugins {
        runtime ":svn:1.0.2"
    }

    dependencies {
        provided "org.apache.ivy:ivy:2.2.0"
        provided("org.apache.maven:maven-ant-tasks:2.1.0",
                 "org.codehaus.groovy.modules.http-builder:http-builder:0.5.0") {
            excludes "commons-logging", "xml-apis", "groovy"
        }
        test("org.gmock:gmock:0.8.0") {
            export = false
        }
    }
}
