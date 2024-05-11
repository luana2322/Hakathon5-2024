package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository  extends JpaRepository<City,Long> {
}
