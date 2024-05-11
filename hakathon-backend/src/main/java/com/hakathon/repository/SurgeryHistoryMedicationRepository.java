package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.SurgeryHistory_Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurgeryHistoryMedicationRepository  extends JpaRepository<SurgeryHistory_Medication,Long> {
}
