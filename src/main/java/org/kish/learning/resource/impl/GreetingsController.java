package org.kish.learning.resource.impl;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import org.kish.learning.repo.model.Person;
import org.kish.learning.service.Greet;
import org.kish.learning.service.PersonService;

@Controller("/naut")
public class GreetingsController {

    private final Greet greet;
    private final PersonService personService;

    public GreetingsController(Greet greet,PersonService personService){
        this.greet = greet;
        this.personService = personService;
    }


    @Get(value = "/greetings" , produces = MediaType.TEXT_PLAIN)
    public String greetUser(){
        return greet.greetUser();
    }

    @Get(value = "/greetings/{user}" , produces = MediaType.TEXT_PLAIN)
    public String greetUser(String user){
        return greet.greetUser(user);
    }

    @Post(value = "/person" , produces = MediaType.APPLICATION_JSON , consumes = MediaType.APPLICATION_JSON)
    public Person savePerson(Person person){
        return this.personService.savePerson(person);
    }

    @Get(value = "/person" , produces = MediaType.APPLICATION_JSON )
    public Iterable<Person> listPersons(){
        return this.personService.getAllPersons();
    }

    @Get(value = "/person/{id}" , produces = MediaType.APPLICATION_JSON )
    public Person personById(@PathVariable(name = "id") Long id){
        return this.personService.getPersons(id).get();
    }

    @Get(value = "/person/lname/{lname}" , produces = MediaType.APPLICATION_JSON )
    public Iterable<Person> personByLName(@PathVariable(name = "lname") String lname){
        return this.personService.getByLastName(lname);
    }


    @Get(value = "/person/fname/{fname}" , produces = MediaType.APPLICATION_JSON )
    public Iterable<Person> personByFName(@PathVariable(name = "fname") String fname){
        return this.personService.getByFirstName(fname);
    }

    @Get(value = "/person/email/{email}" , produces = MediaType.APPLICATION_JSON )
    public Person personByEmail(@PathVariable(name = "email") String email){
        return this.personService.getByEmail(email);
    }
}
