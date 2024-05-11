package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialtyRepository  extends JpaRepository<Specialty,Long> {
}
