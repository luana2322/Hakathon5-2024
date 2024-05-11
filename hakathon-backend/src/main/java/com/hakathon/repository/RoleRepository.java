package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository  extends JpaRepository<Role,Long> {
}
