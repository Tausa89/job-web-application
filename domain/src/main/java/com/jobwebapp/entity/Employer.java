package com.jobwebapp.entity;

import com.jobwebapp.enums.AccountRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employer {

    private String companyName;
    private Address companyAddress;
    private AccountRole accountRole = AccountRole.EMPLOYER;
    private Offer jobOffer;


}
