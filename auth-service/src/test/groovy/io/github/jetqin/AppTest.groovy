/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package io.github.jetqin

import spock.lang.Specification

class AppTest extends Specification {
    def "application has a greeting"() {
        setup:
        def app = new AuthApp()

        when:
        def result = app.greeting

        then:
        result != null
    }
}
