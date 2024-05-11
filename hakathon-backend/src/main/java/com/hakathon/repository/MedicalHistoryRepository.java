package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Medical_History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHistoryRepository  extends JpaRepository<Medical_History,Long> {
}
