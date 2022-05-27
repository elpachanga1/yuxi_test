package com.elastisearch.yuxi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elastisearch.yuxi.model.Search;

public interface SearchRepository extends JpaRepository<Search, Integer> {
	
}
