package com.jobwebapp.service.jobseeker;

import com.jobwebapp.dao.jobseeker.JobSeekerRepository;
import com.jobwebapp.entity.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobSeekerServiceImpl implements JobSeekerService {

    private JobSeekerRepository jobSeekerRepository;


    @Autowired
    public JobSeekerServiceImpl(JobSeekerRepository jobSeekerRepository) {
        this.jobSeekerRepository = jobSeekerRepository;
    }

    @Override
    public List<JobSeeker> findAll() {
        return jobSeekerRepository.findAll();
    }

    @Override
    public JobSeeker getJobSeeker(int id) {

        Optional<JobSeeker> jobSeeker = jobSeekerRepository.findById(id);

        JobSeeker tempJobSeeker = null;

        if (jobSeeker.isPresent()){
            tempJobSeeker = jobSeeker.get();
        }
        return tempJobSeeker;
    }

    @Override
    public void save(JobSeeker jobSeeker) {

        jobSeekerRepository.save(jobSeeker);
    }

    @Override
    public void deleteById(int id) {
        jobSeekerRepository.deleteById(id);
    }
}
