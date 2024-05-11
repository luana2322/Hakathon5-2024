package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Lab_Analysis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabAnalysisRepository extends JpaRepository<Lab_Analysis,Long> {
}
