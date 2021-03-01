package br.com.inmetrics.teste.steps;

import static Utils.Utils.*;
import static Utils.Utils.driver;

import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.RestAssured;

public class Hooks {

	@Before()
	public void setup() throws Exception {
		RestAssured.baseURI = "https://inm-test-api.herokuapp.com";
	}

	@After(order = 1, value = "@website")
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
		System.out.println("------------------CAPTUROU TELA--------------------------------");
	}

	@After(order = 0, value = "@website")
	public void fecharBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

	@After(value = "@api")
	public void tirarScreenshot(Scenario scenario) throws Exception {
		System.out.println("============== " + scenario.getName() + " ==============");
		System.out.println("====================== " + scenario.getStatus() + " ======================");
	}

}
