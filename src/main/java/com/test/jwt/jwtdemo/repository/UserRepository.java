package com.test.jwt.jwtdemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.jwt.jwtdemo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUser(String user);
}
