package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Doctor_Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorReviewRepository  extends JpaRepository<Doctor_Review,Long> {
}
