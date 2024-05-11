package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Medication_MedicationCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationCategoryMedicationRepository  extends JpaRepository<Medication_MedicationCategory,Long> {
}
