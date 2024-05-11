package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository  extends JpaRepository<Appointment,Long> {
}
