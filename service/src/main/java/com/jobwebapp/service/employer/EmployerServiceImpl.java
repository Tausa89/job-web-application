package com.jobwebapp.service.employer;

import com.jobwebapp.dao.jobseeker.EmployerRepository;
import com.jobwebapp.entity.Employer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployerServiceImpl implements EmployerService {

    EmployerRepository employerRepository;


    @Override
    public List<Employer> findAll() {
        return employerRepository.findAll();
    }

    @Override
    public Employer getEmployer(int id) {

        Optional<Employer> employer = employerRepository.findById(id);

        Employer tempEmployer = null;

        if(employer.isPresent()){

            tempEmployer = employer.get();
        }
        return tempEmployer;
    }

    @Override
    public void save(Employer employer) {

        employerRepository.save(employer);

    }

    @Override
    public void deleteById(int id) {

        employerRepository.deleteById(id);
    }
}
