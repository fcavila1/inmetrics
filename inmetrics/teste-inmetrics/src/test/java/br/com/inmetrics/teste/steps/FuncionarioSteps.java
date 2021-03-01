package br.com.inmetrics.teste.steps;

import static Utils.Utils.ExecutarClasse;
import static org.junit.Assert.assertTrue;

import br.com.inmetrics.teste.pageObjects.FuncionarioPage;
import br.com.inmetrics.teste.pageObjects.LoginPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class FuncionarioSteps {

//	CADASTRO DE FUNCIONÁRIOS
	@Dado("^realizar o login com o usuario \"([^\"]*)\" e a senha \"([^\"]*)\"$")
	public void realizarOLoginComOUsuarioEASenha(String user, String pass) throws Throwable {
	    ExecutarClasse(LoginPage.class).realizarLogin(user, pass);
	}

	@Quando("^eu selecionar o link NOVO FUNCIONÁRIO$")
	public void euSelecionarOLinkNOVOFUNCIONÁRIO() throws Throwable {
		ExecutarClasse(FuncionarioPage.class).clicarLinkNovoFuncionario();
	}

	@Quando("^informar os dados válidos de um funcionário$")
	public void informarOsDadosVálidosDeUmFuncionário() throws Throwable {
	    ExecutarClasse(FuncionarioPage.class).inserirDadosNovoFuncionario("Carlos Dantas", "929.376.570-52", "Masculino", "23022021", "Gerente", "800000");
	}

	@Quando("^enviar o formulário$")
	public void submeterOFormulário() throws Throwable {
		ExecutarClasse(FuncionarioPage.class).enviarFormularioDeCadastro();
	}

	@Entao("^o sistema exibirá a mensagem de sucesso$")
	public void oSistemaExibiráAMensagem() throws Throwable {
	    assertTrue(ExecutarClasse(FuncionarioPage.class).retornaTextoConfirmacaoEdicaoExclusaoCadastroFunc());
	}
	
	
//	EDIÇÃO DE FUNCIONÁRIOS
	@Dado("^pesquisar o funcionário \"([^\"]*)\"$")
	public void pesquisarOFuncionário(String nome) throws Throwable {
	    ExecutarClasse(FuncionarioPage.class).pesquisarFuncionario(nome);
	}

	@Quando("^eu clicar no botao para editar os dados do funcionário pesquisado$")
	public void euClicarNoBotaoParaEditarOsDadosDoFuncionárioPesquisado() throws Throwable {
	    ExecutarClasse(FuncionarioPage.class).clicarButtonEditar();
	}

	@Quando("^editar seus dados$")
	public void editarSeusDados() throws Throwable {
		ExecutarClasse(FuncionarioPage.class).editarDadosFuncionario("Carlos Dantas Editado", "Analista de Testes", "2500000");
	}
	
//	EXCLUSÃO DE FUNCIONÁRIOS
	
	@Quando("^eu clicar no botao para excluir o funcionário pesquisado$")
	public void euClicarNoBotaoParaExcluirOFuncionárioPesquisado() throws Throwable {
		ExecutarClasse(FuncionarioPage.class).clicarButtonExcluir();
	}
	
//	@After
//	public void fecharBrowser() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.quit();
//	}
}
