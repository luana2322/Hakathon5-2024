package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Alergy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlergyRepository  extends JpaRepository<Alergy,Long> {
}
