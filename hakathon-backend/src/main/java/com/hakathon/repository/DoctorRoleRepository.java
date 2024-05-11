package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Doctor_Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRoleRepository  extends JpaRepository<Doctor_Role,Long> {
}
