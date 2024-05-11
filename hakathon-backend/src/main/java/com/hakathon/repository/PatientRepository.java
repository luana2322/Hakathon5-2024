package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository  extends JpaRepository<Patient,Long> {
}
