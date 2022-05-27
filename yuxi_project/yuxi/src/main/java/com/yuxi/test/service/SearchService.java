package com.yuxi.test.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.yuxi.test.model.Search;

public interface SearchService {
	// public void save(Search yuxiSearch);
	public Page<Search> find(Pageable pageable);
}
