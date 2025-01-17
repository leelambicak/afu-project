package com.imaginnovate.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imaginnovate.user_service.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
