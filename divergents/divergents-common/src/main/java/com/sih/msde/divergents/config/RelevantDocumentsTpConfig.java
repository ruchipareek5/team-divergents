package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="RelevantDocumentsTp",locations="classpath:sql/RelevantDocumentsTp.yml")
public class RelevantDocumentsTpConfig {

    public class java {

	}
	private String selectDocument;
	
	public String getselectDocument() {
		return selectDocument;
	}
	public void setselectDocument(String selectDocument) {
		this.selectDocument = selectDocument;
	}
	
	
}

