package com.demo.services;

import com.demo.entities.Person;
import com.demo.repo.PersonRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service

// Class
public class PersonService {
  //No need to use @Autowired when using Constructor Injection 
  //Dependencies are final 

   private final PersonRepo repo;
   public PersonService(PersonRepo repo)
    {
        // this keyword refers to current instance
        this.repo = repo;
    }

    public List<Person> getAllPerson()
    {   
        return repo.findAll();
    }

   
}