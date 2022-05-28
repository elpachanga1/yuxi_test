package com.yuxi.test.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.yuxi.test.elasticsearch.model.YuxiData;

public interface YuxiDataRepository extends ElasticsearchRepository<YuxiData, String>{

}
