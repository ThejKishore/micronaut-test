package org.kish.learning


import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.annotation.MicronautTest
import org.kish.learning.resource.GreetClient
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class MicroapplicationSpec extends Specification {

    @Inject
    EmbeddedApplication application

    @Inject
    GreetClient testclientClient;


    void 'test it works'() {
        expect:
        application.running
    }

    void 'test greet endpoint'(){
        when:
            String data = testclientClient.greetUser()
        then:
            data == " Hello from micronaut"
    }

    void 'test greet user endpoint'(){
        when:
            String data= testclientClient.greetUser("Thej")
        then:
            data == " Welcome Thej"
    }

}