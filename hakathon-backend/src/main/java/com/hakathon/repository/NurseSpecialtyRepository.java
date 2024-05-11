package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Nurse_Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseSpecialtyRepository  extends JpaRepository<Nurse_Specialty,Long> {
}
