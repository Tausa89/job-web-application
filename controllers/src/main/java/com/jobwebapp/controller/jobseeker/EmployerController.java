package com.jobwebapp.controller.jobseeker;

import com.jobwebapp.dto.EmployerDto;
import com.jobwebapp.entity.Employer;
import com.jobwebapp.service.employer.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployerController {

    private EmployerService employerService;


    @Autowired
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping("/employer")
    public List<EmployerDto> findAll(){

        return employerService.findAll();
    }


}
