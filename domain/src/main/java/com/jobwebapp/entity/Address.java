package com.jobwebapp.entity;


import lombok.*;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
public class Address {

    private String country;
    private String province;
    private String city;
    private String street;
    private int buildingNumber;
    private String postCode;

}
