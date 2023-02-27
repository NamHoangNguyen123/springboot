package edu.ali.demo1.repositories;

import edu.ali.demo1.domain.Person;
import edu.ali.demo1.models.GetAllPersonRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    @Query("SELECT ps FROM Person ps")
    List<Person> getAllPerson();
    @Query("SELECT ps FROM Person ps WHERE ps.id =:id")
    Person findPersonById(long id);
}
