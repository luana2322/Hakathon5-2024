package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.LabType_LabAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabTypeLabAnalysisRepository  extends JpaRepository<LabType_LabAnalysis,Long> {
}
