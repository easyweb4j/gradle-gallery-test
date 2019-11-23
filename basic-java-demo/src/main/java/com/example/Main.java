package com.example;

import com.example.person.entity.Person;

public class Main {

  public static void main(String[] args) {

    Person person = Person.create("demo", 18);
    System.out.println(person.age());
  }

}
