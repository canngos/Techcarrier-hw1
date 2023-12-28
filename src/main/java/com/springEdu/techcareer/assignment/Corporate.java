package com.springEdu.techcareer.assignment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Corporate extends User {
    private String companyName;
    private String companyAddress;
    private String companyEmail;

    private String taxNumber;

    public Corporate(String companyName, String companyAddress, String companyEmail, String taxNumber) {
        super(true);
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyEmail = companyEmail;
        this.taxNumber = taxNumber;
    }
}
