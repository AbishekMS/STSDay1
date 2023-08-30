package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.ApplicantEntities;
import com.example.demo.model.ApplicantPersonal;

public interface ApplicantRepos extends JpaRepository<ApplicantEntities, Integer> {

	/*
	@Query(value="select * from applicant_entities a where  a.id=:ids",nativeQuery = true)
	List<ApplicantPersonal> getpersonalinfo(int ids);
  */
}
