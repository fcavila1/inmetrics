# language: pt
@api
Funcionalidade: Cadastrar empregado pela API
@cadastrar_empregado_api
Cenario: Deve cadastrar um empregado pela Api
	Dado que o usuário cadastre um empregado com admissao "20/02/2020", cargo "Analista", comissao "0,00", cpf "929.376.570-52" departamentoId 1, nome "Fernando Avila FEITO PELA API NAO DELETAR", salario "1.000,00", sexo "m" e tipo de contratacao "clt"
	Entao o status code ao cadastrar um empregado deve ser 202 e me retornar o empregado com nome "Fernando Avila FEITO PELA API NAO DELETAR"