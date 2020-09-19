package org.kish.learning.repo;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import org.kish.learning.repo.model.Person;

@Repository
public interface PersonRepo extends CrudRepository<Person,Long> {

    Iterable<Person> findByFname(String fname);
    Iterable<Person> findByLname(String lname);
    Person findByEmail(String email);

}
