package com.jobwebapp.entity;


import com.jobwebapp.enums.Contract;
import com.jobwebapp.enums.WorkingTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Offer {

    private double salary;
    private double minSalary;
    private double maxSalary;
    private String description;
    //Should it be a collection? List? or Enum still need to figure it out
    private String requiredSkill;
    private Contract contractType;
    private WorkingTime workingTime;

}
