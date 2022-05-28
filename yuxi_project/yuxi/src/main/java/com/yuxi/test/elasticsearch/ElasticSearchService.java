package com.yuxi.test.elasticsearch;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ElasticSearchService {
	
	public String getElasticSearchValues() {
		try {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost:9200/yuxi_data/_search")).build();
			return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::body)
				.get();
		} catch (Exception ex) {
			ex.printStackTrace();
			return "fails";
		}
	}
}
