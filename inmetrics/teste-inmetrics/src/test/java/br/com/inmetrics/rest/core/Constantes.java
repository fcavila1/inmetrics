package br.com.inmetrics.rest.core;

import io.restassured.http.ContentType;

public interface Constantes {

	String APP_BASE_URL = "https://inm-test-api.herokuapp.com";
	Integer APP_PORT = 443;
	String BASE_PATH = "";
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	
	Long MAX_TIMEOUT = 1000L;
}
