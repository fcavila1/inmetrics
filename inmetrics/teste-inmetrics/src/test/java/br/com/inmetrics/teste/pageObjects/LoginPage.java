package br.com.inmetrics.teste.pageObjects;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(name = "username")
	private WebElement inputUsername;
	
	@FindBy(name = "pass")
	private WebElement inputPass;
	
	@FindBy(xpath = "//form//button[contains(.,'Entre')]")
	private WebElement buttonEntre;

	@FindBy(id = "tabela")
	private WebElement tabelaUsuarios;

	public void clicarBotaoEntre() {
		buttonEntre.click();
	}
	
	public void inserirUsername(String user) {
		inputUsername.sendKeys(user);
	}

	public boolean verificaSeTabelaUsuarioEstaNaTela() {
		if (tabelaUsuarios.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void realizarLogin(String user, String pass) {
		inputUsername.sendKeys(user);
		inputPass.sendKeys(pass);
		buttonEntre.click();
	}

}
