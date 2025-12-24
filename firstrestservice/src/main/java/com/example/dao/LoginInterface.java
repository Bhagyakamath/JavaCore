package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.LoginEntity;

@Repository
public interface LoginInterface extends JpaRepository<LoginEntity, String>{

}
