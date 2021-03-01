# language: pt
@api
Funcionalidade: Alterar empregado cadastrado pela API
@alterar_empregado_api
Cenario: Deve alterar um empregado cadastrados pela Api
	Dado que o usuário deseja alterar o nome "Empregado Editado API", o salário "1.500,00" e tipo de contratação "pj" do ultimo empregado cadastrado
	Entao o status code ao alterar o empregado deve ser 200 e retornar o nome do empregado editado