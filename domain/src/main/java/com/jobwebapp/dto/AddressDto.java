package com.jobwebapp.dto;

import com.jobwebapp.entity.Employer;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AddressDto implements Serializable {


    private int id;
    private String country;
    private String province;
    private String city;
    private String street;
    private int buildingNumber;
    private String postCode;
    private EmployerDto employer;
}
