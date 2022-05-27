package com.elastisearch.yuxi.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.elastisearch.yuxi.model.Search;

public interface SearchService {
	public void save(Search yuxiSearch);
	public Page<Search> find(Pageable pageable);
}
