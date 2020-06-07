package com.jobwebapp.service.employer;

import com.jobwebapp.dao.jobseeker.EmployerRepository;
import com.jobwebapp.dto.ConverterDTO;
import com.jobwebapp.dto.EmployerDto;
import com.jobwebapp.entity.Employer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployerServiceImpl implements EmployerService {

    EmployerRepository employerRepository;


    @Autowired
    public EmployerServiceImpl(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    @Override
    public List<EmployerDto> findAll() {

        List<EmployerDto> list = new ArrayList<>();
        List<Employer> employers = employerRepository.findAll();
        for (Employer emp: employers) {
            list.add(ConverterDTO.convert(emp));
//            list.add(EmployerDto
//                    .builder()
//                    .companyName(emp.getCompanyName())
//                    .companyAddress(emp.getCompanyAddress())
//                    .accountRole(emp.getAccountRole())
//                    .jobOffers(emp.getJobOffers())
//                    .build());
        }
        return list;
    }


    //    @Override
//    public List<Employer> findAll() {
//        return employerRepository.findAll();
//    }

    @Override
    public Employer getEmployer(int id) {

        Optional<Employer> employer = employerRepository.findById(id);

        Employer tempEmployer;

        if(employer.isPresent()){

            tempEmployer = employer.get();
        }else {
            throw new RuntimeException("There is no employer  with given id " + id);
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
