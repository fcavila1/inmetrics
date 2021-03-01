package br.com.inmetrics.teste.steps;

import static Utils.Utils.*;
import static org.junit.Assert.assertTrue;

import br.com.inmetrics.teste.pageObjects.LoginPage;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {
	
	@Quando("^informo o usuário cadastrado \"([^\"]*)\"$")
	public void informoOUsuárioCadastrado(String user) throws Throwable {
		ExecutarClasse(LoginPage.class).inserirUsername(user);
	}
	
	@Quando("^seleciono o botao Entre$")
	public void selecionoOBotaoEntre() throws Throwable {
		ExecutarClasse(LoginPage.class).clicarBotaoEntre();
	}
	
	@Então("^a aplicação mostra a tabela de usuários cadastrados$")
	public void a_aplicação_mostra_a_tabela_de_usuários_cadastrados() throws Throwable {
		assertTrue(ExecutarClasse(LoginPage.class).verificaSeTabelaUsuarioEstaNaTela());
	}
	
}
