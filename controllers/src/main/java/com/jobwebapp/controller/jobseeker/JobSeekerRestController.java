package com.jobwebapp.controller.jobseeker;


import com.jobwebapp.entity.JobSeeker;
import com.jobwebapp.service.jobseeker.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JobSeekerRestController {


    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekerRestController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }



    @GetMapping("/jobseekers")
    public List<JobSeeker> findAll(){
        return jobSeekerService.findAll();
    }


}
