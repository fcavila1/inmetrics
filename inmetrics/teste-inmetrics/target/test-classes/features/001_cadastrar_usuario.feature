# language: pt
@website
Funcionalidade: Cadastrar Usuário
@cadastrar_usuario
Cenario: Deve cadastrar um usuário com sucesso
	Dado que estou acessando a aplicação
	E acesso a página de cadastro de usuários
	Quando informo o usuário "desafioTeste"
	E informo a senha "desafioTeste"
	E confirmo a senha "desafioTeste"
	Quando seleciono o botao Cadastrar
	Entao a aplicação retorna para a página de Login