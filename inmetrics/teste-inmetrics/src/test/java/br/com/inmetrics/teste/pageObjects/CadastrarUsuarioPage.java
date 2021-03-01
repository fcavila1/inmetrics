package br.com.inmetrics.teste.pageObjects;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {
	
	@FindBy(linkText = "Cadastre-se")
	private WebElement linkCadastro;
	
	@FindBy(name = "username")
	private WebElement inputUsername;
	
	@FindBy(name = "pass")
	private WebElement inputPass;
	
	@FindBy(name = "confirmpass")
	private WebElement inputConfirmPass;
	
	@FindBy(xpath = "//form//button[contains(.,'Cadastrar')]")
	private WebElement buttonCadastrar;
	
	public void clicarLinkCadastroUsuario() {
		linkCadastro.click();
	}
	
	public void inserirUsername(String user) {
		Random aleatorio = new Random(); // Usando o random para minimizar a possibilidade de cadastrar usuarios repetidos
		int valor = aleatorio.nextInt(1000) + 1;
		inputUsername.sendKeys(user+valor);
	}
	
	public void inserirPassword(String pass) {
		inputPass.sendKeys(pass);
	}
	
	public void inserirConfirmPassword(String confirmpass) {
		inputConfirmPass.sendKeys(confirmpass);
	}
	
	public void clicarBotaoCadastrar() {
		buttonCadastrar.click();
	}
	
}
