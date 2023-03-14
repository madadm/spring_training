package com.cydeo.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {


//    @NotNull Should be not null
//    @NotEmpty should be not ""
//    @NotBlank  should be not "    "
    @NotBlank
    @Size(max=12, min=2)
    private String firstName;
    private String lastName;
    @NotNull
    private LocalDate birthday;

    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Pattern(regexp="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
}
