package org.kish.learning.resource;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;
import org.kish.learning.service.Greet;

@Client("/naut")
public interface GreetClient {

    @Get(value = "/greetings" , produces = MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    String greetUser();

    @Get(value = "/greetings/{user}" , produces = MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    String greetUser(@PathVariable(name = "user") String user);
}