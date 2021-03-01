# language: pt
@website
Funcionalidade: Realizar Login do Usuário
@login
Cenario: Deve realizar o login de um usuário cadastrado
	Dado que estou acessando a aplicação
	Quando informo o usuário cadastrado "desafioTeste1"
	E informo a senha "desafioTeste1"
	Quando seleciono o botao Entre
	Entao a aplicação mostra a tabela de usuários cadastrados