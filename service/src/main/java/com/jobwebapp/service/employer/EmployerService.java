package com.jobwebapp.service.employer;

import com.jobwebapp.entity.Employer;
import com.jobwebapp.entity.JobSeeker;

import java.util.List;

public interface EmployerService {

    List<Employer> findAll();

    Employer getEmployer(int id);

    void save(Employer employer);

    void deleteById(int id);

}
