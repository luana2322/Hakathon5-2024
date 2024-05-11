package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Degree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DegreeRepository extends JpaRepository<Degree,Long> {
}
