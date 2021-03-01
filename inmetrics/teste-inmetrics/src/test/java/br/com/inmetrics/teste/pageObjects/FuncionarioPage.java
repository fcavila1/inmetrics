package br.com.inmetrics.teste.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FuncionarioPage {

	@FindBy(xpath = "//li//a[contains(., 'Novo Funcionário')]")
	private WebElement linkNovoFuncionario;

	@FindBy(id = "inputNome")
	private WebElement inputNome;

	@FindBy(id = "cpf")
	private WebElement inputCpf;

	@FindBy(id = "slctSexo")
	private WebElement selectSexo;

	@FindBy(xpath = "//div//select//option[contains(.,'Masculino')]")
	private WebElement optionMasculino;

	@FindBy(id = "inputAdmissao")
	private WebElement inputAdmissao;

	@FindBy(id = "inputCargo")
	private WebElement inputCargo;

	@FindBy(id = "dinheiro")
	private WebElement inputSalario;

	@FindBy(id = "clt")
	private WebElement radioTipoContratacao;

	@FindBy(xpath = "//div//input[@class='cadastrar-form-btn']")
	private WebElement buttonEnviar;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible fade show']")
	private WebElement textoConfirmacaoDeCadastroEdicaoExclusaoFuncionario;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement inputSearch;

	@FindBy(xpath = "//table//tr[@class='odd'][1]//td//a//button//span[@class='fa fa-pencil']")
	private WebElement buttonEditar;
	
	@FindBy(xpath = "//table//tr[@class='odd'][1]//td//a//button[@id='delete-btn']")
	private WebElement buttonExcluir;

//	METODOS

	public void clicarLinkNovoFuncionario() {
		linkNovoFuncionario.click();
	}

	public void inserirDadosNovoFuncionario(String nome, String cpf, String sexo, String admissao, String cargo,
			String salario) {
		inputNome.sendKeys(nome);
		inputCpf.sendKeys(cpf);
		selectSexo.click();
		optionMasculino.click();
		inputAdmissao.sendKeys(admissao);
		inputCargo.sendKeys(cargo);
		inputSalario.sendKeys(salario);
		radioTipoContratacao.click();
	}

	public void enviarFormularioDeCadastro() {
		buttonEnviar.click();
	}

	public boolean retornaTextoConfirmacaoEdicaoExclusaoCadastroFunc() {
		return textoConfirmacaoDeCadastroEdicaoExclusaoFuncionario.isDisplayed();
	}

	public void pesquisarFuncionario(String nome) {
		inputSearch.sendKeys(nome);
	}

	public void clicarButtonEditar() {
		buttonEditar.click();
	}

	public void editarDadosFuncionario(String nome, String cargo, String salario) {
		inputNome.clear();
		inputNome.sendKeys(nome);
		inputCargo.clear();
		inputCargo.sendKeys(cargo);
		inputSalario.clear();
		inputSalario.sendKeys(salario);
	}
	
	public void clicarButtonExcluir() {
		buttonExcluir.click();
	}
}
