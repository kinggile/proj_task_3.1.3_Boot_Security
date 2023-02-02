package com.example.SpringBoot_Security.repository;

import com.example.SpringBoot_Security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
