package com.kevin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevin.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findById(Long id);
}