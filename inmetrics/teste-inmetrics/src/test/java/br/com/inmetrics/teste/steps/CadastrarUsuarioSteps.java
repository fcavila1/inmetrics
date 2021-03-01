package br.com.inmetrics.teste.steps;

import static Utils.Utils.*;
import static Utils.Utils.acessarAplicacao;
import static Utils.Utils.driver;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.inmetrics.teste.pageObjects.CadastrarUsuarioPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastrarUsuarioSteps {
	
	
	@Dado("^que estou acessando a aplicação$")
	public void queEstouAcessandoAAplicação() throws Throwable {
		acessarAplicacao();
	}

	@Dado("^acesso a página de cadastro de usuários$")
	public void acessoAPáginaDeCadastroDeUsuários() throws Throwable {
		ExecutarClasse(CadastrarUsuarioPage.class).clicarLinkCadastroUsuario();
	}

	@Quando("^informo o usuário \"([^\"]*)\"$")
	public void informoOUsuário(String user) throws Throwable {
		ExecutarClasse(CadastrarUsuarioPage.class).inserirUsername(user);
	}

	@Quando("^informo a senha \"([^\"]*)\"$")
	public void informoASenha(String pass) throws Throwable {
		ExecutarClasse(CadastrarUsuarioPage.class).inserirPassword(pass);
	}

	@Quando("^confirmo a senha \"([^\"]*)\"$")
	public void confirmoASenha(String confirmpass) throws Throwable {
		ExecutarClasse(CadastrarUsuarioPage.class).inserirConfirmPassword(confirmpass);
	}

	@Quando("^seleciono o botao Cadastrar$")
	public void selecionoOBotaoCadastrar() throws Throwable {
		ExecutarClasse(CadastrarUsuarioPage.class).clicarBotaoCadastrar();
	}
	
	@Entao("^a aplicação retorna para a página de Login$")
	public void a_aplicação_retorna_para_a_página_de_Login() throws Throwable {
	   WebElement tituloLogin = driver.findElement(By.xpath("//span[@class='login100-form-title p-b-1']"));
	   esperarElemento(tituloLogin);
	   assertEquals("Login", tituloLogin.getText());
	}
	
}
