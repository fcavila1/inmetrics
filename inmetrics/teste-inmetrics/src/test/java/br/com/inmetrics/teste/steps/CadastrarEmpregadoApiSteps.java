package br.com.inmetrics.teste.steps;

import br.com.inmetrics.model.EmpregadoModel;
import br.com.inmetrics.singleton.EmpregadoSingleton;
import br.com.inmetrics.teste.testeApi.EmpregadoTestApi;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class CadastrarEmpregadoApiSteps {

	// Recebendo a instancia dos atributos
	EmpregadoModel empregado = EmpregadoSingleton.getInstance();

	// Criando objeto da classe que executa as requisicoes
	EmpregadoTestApi empregadoTest = new EmpregadoTestApi();

	@Dado("^que o usuário cadastre um empregado com admissao \"([^\"]*)\", cargo \"([^\"]*)\", comissao \"([^\"]*)\", cpf \"([^\"]*)\" departamentoId (\\d+), nome \"([^\"]*)\", salario \"([^\"]*)\", sexo \"([^\"]*)\" e tipo de contratacao \"([^\"]*)\"$")
	public void queOUsuárioCadastreUmEmpregadoComAdmissaoCargoComissaoCpfDepartamentoIdNomeSalarioSexoETipoDeContratacao(
			String admissao, String cargo, String comissao, String cpf, int departamento, String nome, String salario, String sexo,
			String tipoContratacao) throws Throwable {

		empregado.setAdmissao(admissao);
		empregado.setCargo(cargo);
		empregado.setComissao(comissao);
		empregado.setCpf(cpf);
		empregado.setDepartamentoId(departamento);
		empregado.setNome(nome);
		empregado.setSalario(salario);
		empregado.setSexo(sexo);
		empregado.setTipoContratacao(tipoContratacao);

	}

//	@Entao("^o status code ao cadastrar um empregado deve ser (\\d+)$")
//	public void oStatusCodeAoCadastrarUmEmpregadoDeveSer(int arg1) throws Throwable {
//		empregadoTest.cadastrarEmpregado();
//	}
	
	@Entao("^o status code ao cadastrar um empregado deve ser (\\d+) e me retornar o empregado com nome \"([^\"]*)\"$")
	public void oStatusCodeAoCadastrarUmEmpregadoDeveSerEMeRetornarOEmpregadoComNome(int statusCode, String nome) throws Throwable {
		empregadoTest.cadastrarEmpregado(statusCode, nome);
	}
}
