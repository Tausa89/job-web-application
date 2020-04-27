package com.jobwebapp.service.jobseeker;

import com.jobwebapp.entity.JobSeeker;

import java.util.List;

public interface JobSeekerService {

    List<JobSeeker> findAll();

    JobSeeker getJobSeeker(int id);

    void save(JobSeeker jobSeeker);

    void deleteById(int id);

}
