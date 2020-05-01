package com.jobwebapp.dao.jobseeker;

import com.jobwebapp.entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer,Integer> {
}
