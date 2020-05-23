package com.jobwebapp.dto;

import com.jobwebapp.entity.Address;
import com.jobwebapp.entity.JobOffer;
import com.jobwebapp.enums.AccountRole;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class EmployerDto implements Serializable {



    private int id;
    private String companyName;
    private AccountRole accountRole = AccountRole.EMPLOYER;
    private List<JobOfferDto> jobOffers;
    private AddressDto companyAddress;


}
