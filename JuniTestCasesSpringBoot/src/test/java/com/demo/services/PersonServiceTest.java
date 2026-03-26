package com.demo.services;
//USing BDD Mockito 
import static org.mockito.BDDMockito.verify;
import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;

import com.demo.repo.PersonRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

// Main class
class PersonServiceTest {

    @Mock
  private PersonRepo personRepo;
  //When using Mockito Use @InjectMocks to inject
  //Mocked beans to following class
    @InjectMocks
  private PersonService personService;

    @Test 
  void getAllPerson()
    {
      //given
       Person person= new Person( 1,"Ahnis","Gotham");
       Person person2= new Person(2,"Saksham","New york");
      //When
       given(personRepo.findAll())
      .willReturn(List.of(person,person2));
      var  personList = personService.getAllPerson();
       //Then
    //Make sure to import assertThat From org.assertj.core.api package
         assertThat(personList).isNotNull();
         assertThat(personList.size()).isEqualTo(2);
  }
}