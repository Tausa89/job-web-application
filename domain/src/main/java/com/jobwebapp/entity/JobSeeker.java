package com.jobwebapp.entity;


import com.jobwebapp.enums.AccountRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class JobSeeker {

    private String firstName;
    private String lastName;
    private AccountRole accountRole = AccountRole.JOB_SEEKER;

}
