package org.kish.learning.service.impl


import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class GreetServiceTest extends Specification {

    @Inject
    GreetService greetService;

    void 'test the greet anonymous'(){
        when:
            String data = greetService.greetUser()
        then:
            data == " Hello from micronaut"
    }


    void 'test the  greet #user and #msg'(){
        when:
            String data = greetService.greetUser(user)
        then:
            data == msg

        where:
            user | msg
            'Thej'   | ' Welcome Thej'
            'Shanaya'   | ' Welcome Shanaya'
    }
}
