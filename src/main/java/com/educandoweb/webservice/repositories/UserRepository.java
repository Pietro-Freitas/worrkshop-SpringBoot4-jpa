package com.educandoweb.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.webservice.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}