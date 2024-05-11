package com.hakathon.repository;

import com.hakathon.model.MedicalHistory_Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHistoryDoctorRepository  extends JpaRepository<MedicalHistory_Doctor,Long> {
}
