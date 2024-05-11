package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital,Long> {
}
