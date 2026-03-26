package com.demo.repo;

import com.demo.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// Interface
// Extends JpaRepository
public interface PersonRepo  extends JpaRepository<Person, Integer> {
  //Spring data jpa  will automatically provide implementation for it when using existsBy{fieldName}
    Boolean existsById(Integer id);
}