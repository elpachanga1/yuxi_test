package com.yuxi.test.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yuxi.test.model.Search;
import com.yuxi.test.repository.SearchRepository;
import com.yuxi.test.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {
	@Autowired
	private SearchRepository searchRepository;

	/*@Override
	public void save(Search yuxiSearch) {
		searchRepository.save(yuxiSearch);
	}*/
	
	public Page<Search> find(Pageable pageable) {
		return searchRepository.findAll(pageable);
	}
}
