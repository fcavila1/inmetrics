# language: pt
@api
Funcionalidade: Listar empregado cadastrado pela API
@listar_empregado_cadastrado_api
Cenario: Deve listar um empregado cadastrado pela Api
	Dado que o usuário deseja consultar o último empregado cadastrado
	Entao o status code ao consultar um empregado deve ser 202 e retornar o nome do usuário