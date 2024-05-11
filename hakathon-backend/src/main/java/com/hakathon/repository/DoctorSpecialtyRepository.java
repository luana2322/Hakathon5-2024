package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Doctor_Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorSpecialtyRepository  extends JpaRepository<Doctor_Specialty,Long> {
}
