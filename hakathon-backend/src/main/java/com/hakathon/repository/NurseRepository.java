package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseRepository  extends JpaRepository<Nurse,Long> {
}
