package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Medication_Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationImageRepository  extends JpaRepository<Medication_Image,Long> {
}
