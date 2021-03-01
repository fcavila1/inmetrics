# language: pt
@api
Funcionalidade: Listar todos empregados cadastrados pela API
@listar_todos_empregados_api
Cenario: Deve listar todos empregados cadastrados pela Api
	Dado que o usuário deseja listar todos os empregados cadastrados
	Entao o status code ao listar todos os empregados deve ser 200 e a lista deve ser maior que 0 ocorrências