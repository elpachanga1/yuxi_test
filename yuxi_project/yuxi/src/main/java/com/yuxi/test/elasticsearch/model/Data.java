package com.yuxi.test.elasticsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import com.yuxi.test.elasticsearch.Indices;

//@Document(indexName = Indices.DATA_INDEX)
@Setting(settingPath = "static/es-settings.json")
public class Data {
	@Field(type = FieldType.Text)
	private String task;
	
	@Field(type = FieldType.Text)
	private String solution;
	
	@Field(type = FieldType.Text)
	private String summary;
	
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
}