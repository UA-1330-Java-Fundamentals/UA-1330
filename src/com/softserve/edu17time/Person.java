package com.softserve.edu17time;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
//@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String address;

}