package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Call;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallRepository  extends JpaRepository<Call,Long> {
}
