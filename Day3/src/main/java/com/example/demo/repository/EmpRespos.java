package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EmpModel;

public interface EmpRespos extends JpaRepository<EmpModel, Integer> {

}
