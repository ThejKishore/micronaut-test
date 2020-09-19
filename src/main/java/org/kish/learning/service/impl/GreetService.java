package org.kish.learning.service.impl;

import org.kish.learning.service.Greet;

import javax.inject.Singleton;
import javax.validation.constraints.NotEmpty;

@Singleton
public class GreetService implements Greet {


    @Override
    public String greetUser() {
        return String.format(" Hello from micronaut");
    }

    @Override
    public String greetUser(@NotEmpty String name) {
        return String.format(" Welcome %s",name);
    }
}
