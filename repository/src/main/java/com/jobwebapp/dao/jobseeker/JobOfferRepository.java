package com.jobwebapp.dao.jobseeker;

import com.jobwebapp.entity.JobOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobOfferRepository extends JpaRepository<JobOffer, Integer> {
}
