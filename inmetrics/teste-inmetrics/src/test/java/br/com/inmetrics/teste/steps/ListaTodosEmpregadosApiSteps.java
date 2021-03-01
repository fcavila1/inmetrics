package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.testeApi.EmpregadoTestApi;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class ListaTodosEmpregadosApiSteps {

	// Criando objeto da classe que executa as requisicoes
	EmpregadoTestApi empregadoTest = new EmpregadoTestApi();

	@Dado("^que o usuário deseja listar todos os empregados cadastrados$")
	public void queOUsuárioDesejaListarTodosOsEmpregadosCadastrados() throws Throwable {
		// Apenas precondição
	}

	@Entao("^o status code ao listar todos os empregados deve ser (\\d+) e a lista deve ser maior que (\\d+) ocorrências$")
	public void oStatusCodeAoListarTodosOsEmpregadosDeveSerEAListaDeveSerMaiorQueOcorrências(int statusCode, int tamanhoLista)
			throws Throwable {
		empregadoTest.listarTodosEmpregados(statusCode, tamanhoLista);
	}

}
