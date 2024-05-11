package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationRepository  extends JpaRepository<Medication,Long> {
}
