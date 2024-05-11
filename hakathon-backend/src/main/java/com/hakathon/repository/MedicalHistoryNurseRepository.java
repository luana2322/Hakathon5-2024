package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.MedicalHistory_Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHistoryNurseRepository  extends JpaRepository<MedicalHistory_Nurse,Long> {
}
