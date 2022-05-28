package com.yuxi.test.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuxi.test.jpa.model.Search;

public interface SearchRepository extends JpaRepository<Search, Integer> {
	
}
