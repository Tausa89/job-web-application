package com.jobwebapp.dto;

import com.jobwebapp.entity.Employer;
import com.jobwebapp.enums.Contract;
import com.jobwebapp.enums.WorkingTime;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class JobOfferDto implements Serializable {


    private int id;
    private double salary;
    private double minSalary;
    private double maxSalary;
    private String description;
    //Should it be a collection? List? or Enum still need to figure it out
    private String requiredSkill;
    private Contract contractType;
    private WorkingTime workingTime;

    private EmployerDto employerDto;
}
