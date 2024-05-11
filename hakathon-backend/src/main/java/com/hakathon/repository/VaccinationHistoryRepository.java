package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Vaccination_History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationHistoryRepository  extends JpaRepository<Vaccination_History,Long> {
}
