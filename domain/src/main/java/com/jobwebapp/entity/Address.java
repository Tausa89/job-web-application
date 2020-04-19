package com.jobwebapp.entity;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Address {

    private String country;
    private String province;
    private String city;
    private String street;
    private int buildingNumber;
    private String postCode;

}
