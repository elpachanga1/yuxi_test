package com.yuxi.test.elasticsearch.model;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import com.yuxi.test.elasticsearch.Indices;

@Document(indexName = Indices.YUXI_DATA_INDEX)
@Setting(settingPath = "static/es-settings.json")
public class YuxiData {
	@Field(type = FieldType.Object)
	private List<Data> data;
	
	@Field(type = FieldType.Text)
	private String version;

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}
