package com.example.person;

import com.example.person.entity.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTest {

  @Test
  public void personEntity() {
    Person person = Person.create("demo", 18);
    Assert.assertEquals(person.age(), Integer.valueOf(18));
  }
}
