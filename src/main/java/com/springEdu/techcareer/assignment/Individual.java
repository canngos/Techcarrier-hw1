package com.springEdu.techcareer.assignment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Individual extends User {
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;

    public Individual(String name, String surname, String email, String phoneNumber) {
        super(false);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
