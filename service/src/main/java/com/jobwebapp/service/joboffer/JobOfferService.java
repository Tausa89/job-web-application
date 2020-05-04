package com.jobwebapp.service.joboffer;

import com.jobwebapp.entity.Employer;
import com.jobwebapp.entity.JobOffer;

import java.util.List;

public interface JobOfferService {


    List<JobOffer> findAll();

    JobOffer getJobOffer(int id);

    void save(JobOffer jobOffer);

    void deleteById(int id);
}
