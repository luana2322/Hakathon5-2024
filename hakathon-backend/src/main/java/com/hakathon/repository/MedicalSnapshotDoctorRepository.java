package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.MedicalSnapshot_Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalSnapshotDoctorRepository  extends JpaRepository<MedicalSnapshot_Doctor,Long> {
}
