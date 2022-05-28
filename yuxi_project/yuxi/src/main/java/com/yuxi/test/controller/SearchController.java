package com.yuxi.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yuxi.test.elasticsearch.model.YuxiData;
import com.yuxi.test.elasticsearch.service.YuxiDataService;
import com.yuxi.test.jpa.model.Search;
import com.yuxi.test.jpa.service.SearchService;

@RestController
public class SearchController {
	@Autowired
	private SearchService searchService;
	private YuxiDataService yuxiDataService;
	
	@GetMapping("searchhistory")
	public List<Search> getSearches(
		@RequestParam(required = false, defaultValue = "0") int page,
		@RequestParam(required = false, defaultValue = "50") int size
	) {
		Pageable pagingSort = PageRequest.of(page, size);
		Page<Search> result = searchService.find(pagingSort); 
		return result.getContent();
	}
	
	/*@PostMapping("savesearch")
	public Search saveSearch(@RequestBody Search yuxiSearch) {
		searchService.save(yuxiSearch);
		return yuxiSearch;
	}*/
	
	@GetMapping("searchdata")
	public List<YuxiData> getData() {
		return yuxiDataService.findAll();
	}
	
	/*@GetMapping("searchdata/{id}")
	public YuxiData getData(@PathVariable String id) {
		return yuxiDataService.findById(id);
	}*/
}
