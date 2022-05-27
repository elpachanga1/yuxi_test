package com.yuxi.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuxi.test.model.Search;

public interface SearchRepository extends JpaRepository<Search, Integer> {
	
}
