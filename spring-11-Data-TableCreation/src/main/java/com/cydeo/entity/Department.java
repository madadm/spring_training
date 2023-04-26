package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="departments")
@AllArgsConstructor
@NoArgsConstructor
public class Department extends BaseEntity {

    private String department;
    private String division;


}
