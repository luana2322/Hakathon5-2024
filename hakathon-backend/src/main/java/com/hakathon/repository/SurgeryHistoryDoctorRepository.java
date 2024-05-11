package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.SurgeryHistory_Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurgeryHistoryDoctorRepository  extends JpaRepository<SurgeryHistory_Doctor,Long> {
}
