package edu.ali.demo1.services;

import edu.ali.demo1.domain.Person;
import edu.ali.demo1.models.GetAllPersonRes;

import java.util.List;

public interface PersonService {

    List<Person> getAllPerson();
    Person findById(long id);
}
