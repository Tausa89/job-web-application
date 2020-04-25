package com.jobwebapp.entity;

import com.jobwebapp.enums.AccountRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String companyName;
    @Column(name = "account_role")
    private AccountRole accountRole = AccountRole.EMPLOYER;


    private JobOffer jobOffer;

    @OneToOne(mappedBy = "employer", cascade = CascadeType.ALL)
    private Address companyAddress;


}
