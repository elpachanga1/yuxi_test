package com.yuxi.test.elasticsearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuxi.test.elasticsearch.model.YuxiData;
import com.yuxi.test.elasticsearch.repository.YuxiDataRepository;

@Service
public class YuxiDataService {
	private final YuxiDataRepository repository;
	
	@Autowired
	public YuxiDataService(YuxiDataRepository repository) {
		this.repository = repository;
	}
	
	public YuxiData findById(final String id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<YuxiData> findAll() {
		return (List<YuxiData>) repository.findAll();
	}
}
