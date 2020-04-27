package com.jobwebapp.dao.jobseeker;

import com.jobwebapp.entity.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerRepository extends JpaRepository<JobSeeker, Integer> {
}
