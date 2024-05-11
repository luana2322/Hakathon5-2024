package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.SurgeryHistory_Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurgeryHistoryNurseRepository  extends JpaRepository<SurgeryHistory_Nurse,Long> {
}
