package com.jobwebapp.entity;


import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "country")
    private String country;
    @Column(name = "province")
    private String province;
    @Column(name = "city")
    private String city;
    @Column(name = "street")
    private String street;
    @Column(name = "building_number")
    private int buildingNumber;
    @Column(name = "post_code")
    private String postCode;

    @OneToOne
    @MapsId
    private Employer employer;

}
