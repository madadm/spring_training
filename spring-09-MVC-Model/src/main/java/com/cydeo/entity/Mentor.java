package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {

  private String firstName;
  private String lastName;
  private int age;
  private Gender gender;
}
