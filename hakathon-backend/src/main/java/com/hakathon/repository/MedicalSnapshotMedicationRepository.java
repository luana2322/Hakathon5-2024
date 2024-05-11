package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.MedicalSnapshot_Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalSnapshotMedicationRepository  extends JpaRepository<MedicalSnapshot_Medication,Long> {
}
