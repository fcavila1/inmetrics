# language: pt
@website
Funcionalidade: Realizar operações de funcionários

@cadastrar
Cenario: Cadastrar um Funcionário
	Dado que estou acessando a aplicação
	E realizar o login com o usuario "desafioTeste1" e a senha "desafioTeste1"
	Quando eu selecionar o link NOVO FUNCIONÁRIO
	E informar os dados válidos de um funcionário
	E enviar o formulário
	Entao o sistema exibirá a mensagem de sucesso

@editar
Cenario: Editar um Funcionário
	Dado que estou acessando a aplicação
	E realizar o login com o usuario "desafioTeste1" e a senha "desafioTeste1"
	E pesquisar o funcionário "Carlos Dantas"
	Quando eu clicar no botao para editar os dados do funcionário pesquisado
	E editar seus dados
	E enviar o formulário
	Entao o sistema exibirá a mensagem de sucesso
	
@excluir
Cenario: Excluir um Funcionário
	Dado que estou acessando a aplicação
	E realizar o login com o usuario "desafioTeste1" e a senha "desafioTeste1"
	E pesquisar o funcionário "Carlos Dantas"
	Quando eu clicar no botao para excluir o funcionário pesquisado
	Entao o sistema exibirá a mensagem de sucesso
