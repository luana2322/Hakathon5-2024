package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
