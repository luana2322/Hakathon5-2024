package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Surgery_History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurgeryHistoryRepository  extends JpaRepository<Surgery_History,Long> {
}
