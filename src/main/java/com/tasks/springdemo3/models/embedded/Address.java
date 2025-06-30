package com.tasks.springdemo3.models.embedded;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {

    private String StreetName;
    private String HouseNumber;
    private String ZipCode;
}
