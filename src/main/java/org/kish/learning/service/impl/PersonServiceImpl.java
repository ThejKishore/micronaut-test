package org.kish.learning.service.impl;

import org.kish.learning.repo.PersonRepo;
import org.kish.learning.repo.model.Person;
import org.kish.learning.service.PersonService;

import javax.inject.Singleton;
import java.util.Optional;

@Singleton
public class PersonServiceImpl implements PersonService {

    private final PersonRepo personRepo;

    public PersonServiceImpl(PersonRepo personRepo){
        this.personRepo = personRepo;
    }

    public Iterable<Person> getAllPersons(){
        return personRepo.findAll();
    }

    public Iterable<Person> getByLastName(String lnmae){
        return personRepo.findByLname(lnmae);
    }

    @Override
    public Iterable<Person> getByFirstName(String fnmae) {
        return personRepo.findByFname(fnmae);
    }

    @Override
    public Person getByEmail(String email) {
        return personRepo.findByEmail(email);
    }

    public Optional<Person> getPersons(Long id){
        return personRepo.findById(id);
    }

    public Person savePerson(Person person){
        return personRepo.save(person);
    }


}
