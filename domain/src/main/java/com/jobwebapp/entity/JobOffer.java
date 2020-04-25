package com.jobwebapp.entity;


import com.jobwebapp.enums.Contract;
import com.jobwebapp.enums.WorkingTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_offer")
public class JobOffer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "salary")
    private double salary;
    @Column(name = "min_salary")
    private double minSalary;
    @Column(name = "max_salary")
    private double maxSalary;
    @Column(name = "description")
    private String description;
    //Should it be a collection? List? or Enum still need to figure it out
    @Column(name = "required_skill")
    private String requiredSkill;
    @Column(name = "contract_type")
    private Contract contractType;
    @Column(name = "working_time")
    private WorkingTime workingTime;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "employer_id")
    private Employer employer;

}
