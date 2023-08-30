package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Bikemodel;

import jakarta.transaction.Transactional;

public interface BikeRepos extends JpaRepository<Bikemodel, Integer> {

	
@Query(value="select * from bike where ownername=:name ",nativeQuery = true)
	List<Bikemodel> findbyname(String name);
@Query(value="select * from bike where bikename=:bike",nativeQuery = true)
List<Bikemodel> findbybike(String bike);
@Modifying
@Transactional
@Query(value="update bike set year=:yr where modelname=:mn",nativeQuery = true)
public int updateyr(int yr,String mn);
@Modifying
@Transactional
@Query(value = "delete from bike where regno=:reg or year=:yr",nativeQuery = true)
public int delete(int reg, int yr);


}
