package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Patient_Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRoleRepository  extends JpaRepository<Patient_Role,Long> {
}
