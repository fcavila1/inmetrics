package br.com.inmetrics.model;

public class EmpregadoModel {

	private Integer empregadoId;
	private String admissao;
	private String cargo;
	private String comissao;
	private String cpf;
	private Integer departamentoId;
	private String nome;
	private String salario;
	private String sexo;
	private String tipoContratacao;

	public String getAdmissao() {
		return admissao;
	}

	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getComissao() {
		return comissao;
	}

	public void setComissao(String comissao) {
		this.comissao = comissao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(Integer departamentoId) {
		this.departamentoId = departamentoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTipoContratacao() {
		return tipoContratacao;
	}

	public void setTipoContratacao(String tipoContratacao) {
		this.tipoContratacao = tipoContratacao;
	}

	@Override
	public String toString() {
		String empregado = "admissao:" + getAdmissao() + "\n" + "" + getCargo() + "\n" + getComissao() + "\n" + getCpf()
				+ "\n" + getNome() + "\n" + getSalario() + "\n" + getSexo() + "\n" + getTipoContratacao() + "\n"
				+ getDepartamentoId();
		return empregado;
	}

	public Integer getEmpregadoId() {
		return empregadoId;
	}

	public void setEmpregadoId(Integer empregadoId) {
		this.empregadoId = empregadoId;
	}

}
