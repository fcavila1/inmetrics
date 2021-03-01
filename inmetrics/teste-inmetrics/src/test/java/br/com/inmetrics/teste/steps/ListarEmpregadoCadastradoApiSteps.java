package br.com.inmetrics.teste.steps;

import br.com.inmetrics.model.EmpregadoModel;
import br.com.inmetrics.singleton.EmpregadoSingleton;
import br.com.inmetrics.teste.testeApi.EmpregadoTestApi;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class ListarEmpregadoCadastradoApiSteps {

	// Recebendo a instancia dos atributos
	EmpregadoModel empregado = EmpregadoSingleton.getInstance();

	// Criando objeto da classe que executa as requisicoes
	EmpregadoTestApi empregadoTest = new EmpregadoTestApi();

//	@Dado("^que o usuário deseja consultar um empregado cadastrado de id (\\d+)$")
//	public void queOUsuárioDesejaConsultarUmEmpregadoCadastradoDeId(int id) throws Throwable {
//		empregado.setEmpregadoId(id);
//	}
	@Dado("^que o usuário deseja consultar o último empregado cadastrado$")
	public void queOUsuárioDesejaConsultarOÚltimoEmpregadoCadastrado() throws Throwable {
		// Apenas precondição
	}

//	@Entao("^o status code ao consultar um empregado deve ser (\\d+) e retornar o nome do usuário \"([^\"]*)\"$")
//	public void oStatusCodeAoConsultarUmEmpregadoDeveSerERetornarONomeDoUsuário(int statusCode, String nome)
//			throws Throwable {
//		empregadoTest.listarEmpregadoCadastradoPeloIp(statusCode, nome);
//	}
	
	@Entao("^o status code ao consultar um empregado deve ser (\\d+) e retornar o nome do usuário$")
	public void oStatusCodeAoConsultarUmEmpregadoDeveSerERetornarONomeDoUsuário(int statusCode) throws Throwable {
		empregadoTest.listarEmpregadoCadastradoPeloIp(statusCode);
	}

}
