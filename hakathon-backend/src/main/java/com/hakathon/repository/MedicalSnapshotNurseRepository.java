package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.MedicalSnapshot_Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalSnapshotNurseRepository  extends JpaRepository<MedicalSnapshot_Nurse,Long> {
}
