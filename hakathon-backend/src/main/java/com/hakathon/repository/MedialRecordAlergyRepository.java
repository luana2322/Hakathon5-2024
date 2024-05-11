package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.MedialRecord_Alergy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedialRecordAlergyRepository  extends JpaRepository<MedialRecord_Alergy,Long> {
}
