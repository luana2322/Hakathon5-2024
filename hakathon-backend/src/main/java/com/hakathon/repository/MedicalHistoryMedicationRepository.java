package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.MedicalHistory_Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHistoryMedicationRepository  extends JpaRepository<MedicalHistory_Medication,Long> {
}
