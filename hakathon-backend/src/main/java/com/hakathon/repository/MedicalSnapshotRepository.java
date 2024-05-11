package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Medical_Snapshot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalSnapshotRepository  extends JpaRepository<Medical_Snapshot,Long> {
}
