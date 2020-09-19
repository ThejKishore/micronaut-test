package org.kish.learning.service;

import org.kish.learning.repo.model.Person;

import java.util.Optional;

public interface PersonService {

     Iterable<Person> getAllPersons();

     Iterable<Person> getByLastName(String lnmae);

     Iterable<Person> getByFirstName(String fnmae);

     Person getByEmail(String email);

     Optional<Person> getPersons(Long id);

     Person savePerson(Person person);
}
