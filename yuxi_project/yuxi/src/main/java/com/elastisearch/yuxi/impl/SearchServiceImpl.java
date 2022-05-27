package com.elastisearch.yuxi.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.elastisearch.yuxi.model.Search;
import com.elastisearch.yuxi.repository.SearchRepository;
import com.elastisearch.yuxi.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {
	@Autowired
	private SearchRepository searchRepository;

	@Override
	public void save(Search yuxiSearch) {
		searchRepository.save(yuxiSearch);
	}
	
	public Page<Search> find(Pageable pageable) {
		return searchRepository.findAll(pageable);
	}
}
