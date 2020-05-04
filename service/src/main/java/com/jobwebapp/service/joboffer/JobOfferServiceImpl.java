package com.jobwebapp.service.joboffer;

import com.jobwebapp.dao.jobseeker.JobOfferRepository;
import com.jobwebapp.entity.JobOffer;
import com.jobwebapp.entity.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class JobOfferServiceImpl implements JobOfferService {

    private JobOfferRepository jobOfferRepository;


    @Autowired
    public JobOfferServiceImpl(JobOfferRepository jobOfferRepository) {
        this.jobOfferRepository = jobOfferRepository;
    }

    @Override
    public List<JobOffer> findAll() {
        return jobOfferRepository.findAll();
    }

    @Override
    public JobOffer getJobOffer(int id) {


        Optional<JobOffer> jobOffer = jobOfferRepository.findById(id);

        JobOffer tempJobOffer;

        if (jobOffer.isPresent()) {
            tempJobOffer = jobOffer.get();
        } else {
            throw new RuntimeException("There is no job seeker  with given id " + id);
        }
        return tempJobOffer;

    }

    @Override
    public void save(JobOffer jobOffer) {

        jobOfferRepository.save(jobOffer);
    }

    @Override
    public void deleteById(int id) {

        jobOfferRepository.deleteById(id);
    }
}
