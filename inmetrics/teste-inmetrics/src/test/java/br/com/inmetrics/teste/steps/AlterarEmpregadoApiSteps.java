package br.com.inmetrics.teste.steps;

import br.com.inmetrics.model.EmpregadoModel;
import br.com.inmetrics.singleton.EmpregadoSingleton;
import br.com.inmetrics.teste.testeApi.EmpregadoTestApi;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class AlterarEmpregadoApiSteps {

	// Recebendo a instancia dos atributos
	EmpregadoModel empregado = EmpregadoSingleton.getInstance();
		
	// Criando objeto da classe que executa as requisicoes
	EmpregadoTestApi empregadoTest = new EmpregadoTestApi();
		
	@Dado("^que o usuário deseja alterar o nome \"([^\"]*)\", o salário \"([^\"]*)\" e tipo de contratação \"([^\"]*)\" do ultimo empregado cadastrado$")
	public void queOUsuárioDesejaAlterarONomeOSalárioETipoDeContrataçãoDoUltimoEmpregadoCadastrado(String nome, String salario, String tipoContratacao) throws Throwable {
		empregado.setNome(nome);
		empregado.setSalario(salario);
		empregado.setTipoContratacao(tipoContratacao);
	}

	@Entao("^o status code ao alterar o empregado deve ser (\\d+) e retornar o nome do empregado editado$")
	public void oStatusCodeAoAlterarOEmpregadoDeveSerERetornarONomeDoEmpregadoEditado(int statusCode) throws Throwable {
		empregadoTest.alterarEmpregado(statusCode);
	}
	
}
