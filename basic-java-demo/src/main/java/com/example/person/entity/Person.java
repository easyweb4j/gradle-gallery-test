package com.example.person.entity;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Person {

  public static Person create(String name, Integer age) {
    return new AutoValue_Person(name, age);
  }

  public abstract String name();

  public abstract Integer age();
}
