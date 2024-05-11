package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.LabType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabTypeRepository  extends JpaRepository<LabType,Long> {
}
