package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.MedicationCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationCategoryRepository  extends JpaRepository<MedicationCategory,Long> {
}
