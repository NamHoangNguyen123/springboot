package edu.ali.demo1.controller;

import edu.ali.demo1.domain.Person;
import edu.ali.demo1.models.GetAllPersonRes;
import edu.ali.demo1.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping(value = "Person/")
public class PersonController {
    @Autowired
    private PersonService personService;
    @GetMapping("get-all")
    public List<Person> getAll(){
        return personService.getAllPerson();
    }
    @GetMapping("find-person/{id}")
    public Person findById(@PathVariable("id") long id){
        return personService.findById(id);
    }
}
