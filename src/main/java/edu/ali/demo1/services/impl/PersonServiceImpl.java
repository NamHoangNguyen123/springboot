package edu.ali.demo1.services.impl;

import edu.ali.demo1.domain.Person;
import edu.ali.demo1.models.GetAllPersonRes;
import edu.ali.demo1.repositories.PersonRepository;
import edu.ali.demo1.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAllPerson() {
        try {
            return personRepository.getAllPerson();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;

    }

    @Override
    public Person findById(long id) {
        try{
            return personRepository.findPersonById(id);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
