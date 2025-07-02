package com.test.jwt.jwtdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.jwt.jwtdemo.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}