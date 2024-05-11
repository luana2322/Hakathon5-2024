package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Admin_Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRoleRepository extends JpaRepository<Admin_Role,Long> {
}
