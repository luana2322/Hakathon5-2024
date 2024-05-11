package com.hakathon.repository;

import com.hakathon.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorDegreeRepository  extends JpaRepository<Admin,Long> {
}
