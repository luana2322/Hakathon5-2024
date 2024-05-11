package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Medial_Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedialRecordRepository  extends JpaRepository<Medial_Record,Long> {
}
