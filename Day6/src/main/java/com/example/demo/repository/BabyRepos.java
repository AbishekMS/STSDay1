package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BabyEntity;

public interface BabyRepos extends JpaRepository<BabyEntity, Integer>{

}
