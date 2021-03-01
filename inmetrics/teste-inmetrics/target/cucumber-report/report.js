$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("001_cadastrar_usuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Cadastrar Usuário",
  "description": "",
  "id": "cadastrar-usuário",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@website"
    }
  ]
});
formatter.before({
  "duration": 819665501,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Deve cadastrar um usuário com sucesso",
  "description": "",
  "id": "cadastrar-usuário;deve-cadastrar-um-usuário-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 4,
      "name": "@cadastrar_usuario"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "acesso a página de cadastro de usuários",
  "keyword": "E "
});
formatter.step({
  "line": 8,
  "name": "informo o usuário \"desafioTeste\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "informo a senha \"desafioTeste\"",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "confirmo a senha \"desafioTeste\"",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "seleciono o botao Cadastrar",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "a aplicação retorna para a página de Login",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.queEstouAcessandoAAplicação()"
});
formatter.result({
  "duration": 33284151999,
  "status": "passed"
});
formatter.match({
  "location": "CadastrarUsuarioSteps.acessoAPáginaDeCadastroDeUsuários()"
});
formatter.result({
  "duration": 1775285001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "desafioTeste",
      "offset": 19
    }
  ],
  "location": "CadastrarUsuarioSteps.informoOUsuário(String)"
});
formatter.result({
  "duration": 176884601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "desafioTeste",
      "offset": 17
    }
  ],
  "location": "CadastrarUsuarioSteps.informoASenha(String)"
});
formatter.result({
  "duration": 131631600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "desafioTeste",
      "offset": 18
    }
  ],
  "location": "CadastrarUsuarioSteps.confirmoASenha(String)"
});
formatter.result({
  "duration": 114099900,
  "status": "passed"
});
formatter.match({
  "location": "CadastrarUsuarioSteps.selecionoOBotaoCadastrar()"
});
formatter.result({
  "duration": 2117761200,
  "status": "passed"
});
formatter.match({
  "location": "CadastrarUsuarioSteps.a_aplicação_retorna_para_a_página_de_Login()"
});
formatter.result({
  "duration": 117341301,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 992296000,
  "status": "passed"
});
formatter.after({
  "duration": 3961248400,
  "status": "passed"
});
formatter.uri("002_login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Realizar Login do Usuário",
  "description": "",
  "id": "realizar-login-do-usuário",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@website"
    }
  ]
});
formatter.before({
  "duration": 94901,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Deve realizar o login de um usuário cadastrado",
  "description": "",
  "id": "realizar-login-do-usuário;deve-realizar-o-login-de-um-usuário-cadastrado",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "informo o usuário cadastrado \"desafioTeste1\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "informo a senha \"desafioTeste1\"",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "seleciono o botao Entre",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "a aplicação mostra a tabela de usuários cadastrados",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.queEstouAcessandoAAplicação()"
});
formatter.result({
  "duration": 36636440700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "desafioTeste1",
      "offset": 30
    }
  ],
  "location": "LoginSteps.informoOUsuárioCadastrado(String)"
});
formatter.result({
  "duration": 165854199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "desafioTeste1",
      "offset": 17
    }
  ],
  "location": "CadastrarUsuarioSteps.informoASenha(String)"
});
formatter.result({
  "duration": 120585400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.selecionoOBotaoEntre()"
});
formatter.result({
  "duration": 2317973200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.a_aplicação_mostra_a_tabela_de_usuários_cadastrados()"
});
formatter.result({
  "duration": 59155400,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 982131801,
  "status": "passed"
});
formatter.after({
  "duration": 3917938100,
  "status": "passed"
});
formatter.uri("003_funcionario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Realizar operações de funcionários",
  "description": "",
  "id": "realizar-operações-de-funcionários",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@website"
    }
  ]
});
formatter.before({
  "duration": 109000,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Cadastrar um Funcionário",
  "description": "",
  "id": "realizar-operações-de-funcionários;cadastrar-um-funcionário",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 5,
      "name": "@cadastrar"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "realizar o login com o usuario \"desafioTeste1\" e a senha \"desafioTeste1\"",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "eu selecionar o link NOVO FUNCIONÁRIO",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "informar os dados válidos de um funcionário",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "enviar o formulário",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "o sistema exibirá a mensagem de sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.queEstouAcessandoAAplicação()"
});
formatter.result({
  "duration": 37664743000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "desafioTeste1",
      "offset": 32
    },
    {
      "val": "desafioTeste1",
      "offset": 58
    }
  ],
  "location": "FuncionarioSteps.realizarOLoginComOUsuarioEASenha(String,String)"
});
formatter.result({
  "duration": 2546558400,
  "status": "passed"
});
formatter.match({
  "location": "FuncionarioSteps.euSelecionarOLinkNOVOFUNCIONÁRIO()"
});
formatter.result({
  "duration": 1192957900,
  "status": "passed"
});
formatter.match({
  "location": "FuncionarioSteps.informarOsDadosVálidosDeUmFuncionário()"
});
formatter.result({
  "duration": 883203700,
  "status": "passed"
});
formatter.match({
  "location": "FuncionarioSteps.submeterOFormulário()"
});
formatter.result({
  "duration": 2034244000,
  "status": "passed"
});
formatter.match({
  "location": "FuncionarioSteps.oSistemaExibiráAMensagem()"
});
formatter.result({
  "duration": 52870999,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 867933501,
  "status": "passed"
});
formatter.after({
  "duration": 4450527900,
  "status": "passed"
});
formatter.before({
  "duration": 47900,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Editar um Funcionário",
  "description": "",
  "id": "realizar-operações-de-funcionários;editar-um-funcionário",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 14,
      "name": "@editar"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.step({
  "line": 17,
  "name": "realizar o login com o usuario \"desafioTeste1\" e a senha \"desafioTeste1\"",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "pesquisar o funcionário \"Carlos Dantas\"",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "eu clicar no botao para editar os dados do funcionário pesquisado",
  "keyword": "Quando "
});
formatter.step({
  "line": 20,
  "name": "editar seus dados",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "enviar o formulário",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "o sistema exibirá a mensagem de sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.queEstouAcessandoAAplicação()"
});
formatter.result({
  "duration": 33683394200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "desafioTeste1",
      "offset": 32
    },
    {
      "val": "desafioTeste1",
      "offset": 58
    }
  ],
  "location": "FuncionarioSteps.realizarOLoginComOUsuarioEASenha(String,String)"
});
formatter.result({
  "duration": 2962947500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Carlos Dantas",
      "offset": 25
    }
  ],
  "location": "FuncionarioSteps.pesquisarOFuncionário(String)"
});
formatter.result({
  "duration": 167679600,
  "status": "passed"
});
formatter.match({
  "location": "FuncionarioSteps.euClicarNoBotaoParaEditarOsDadosDoFuncionárioPesquisado()"
});
formatter.result({
  "duration": 2700954600,
  "status": "passed"
});
formatter.match({
  "location": "FuncionarioSteps.editarSeusDados()"
});
formatter.result({
  "duration": 532557300,
  "status": "passed"
});
formatter.match({
  "location": "FuncionarioSteps.submeterOFormulário()"
});
formatter.result({
  "duration": 3016816700,
  "status": "passed"
});
formatter.match({
  "location": "FuncionarioSteps.oSistemaExibiráAMensagem()"
});
formatter.result({
  "duration": 55781000,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 885725100,
  "status": "passed"
});
formatter.after({
  "duration": 4821240200,
  "status": "passed"
});
formatter.before({
  "duration": 44601,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Excluir um Funcionário",
  "description": "",
  "id": "realizar-operações-de-funcionários;excluir-um-funcionário",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 24,
      "name": "@excluir"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.step({
  "line": 27,
  "name": "realizar o login com o usuario \"desafioTeste1\" e a senha \"desafioTeste1\"",
  "keyword": "E "
});
formatter.step({
  "line": 28,
  "name": "pesquisar o funcionário \"Carlos Dantas\"",
  "keyword": "E "
});
formatter.step({
  "line": 29,
  "name": "eu clicar no botao para excluir o funcionário pesquisado",
  "keyword": "Quando "
});
formatter.step({
  "line": 30,
  "name": "o sistema exibirá a mensagem de sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.queEstouAcessandoAAplicação()"
});
formatter.result({
  "duration": 30955091400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "desafioTeste1",
      "offset": 32
    },
    {
      "val": "desafioTeste1",
      "offset": 58
    }
  ],
  "location": "FuncionarioSteps.realizarOLoginComOUsuarioEASenha(String,String)"
});
formatter.result({
  "duration": 3134211500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Carlos Dantas",
      "offset": 25
    }
  ],
  "location": "FuncionarioSteps.pesquisarOFuncionário(String)"
});
formatter.result({
  "duration": 164242401,
  "status": "passed"
});
formatter.match({
  "location": "FuncionarioSteps.euClicarNoBotaoParaExcluirOFuncionárioPesquisado()"
});
formatter.result({
  "duration": 96930600,
  "status": "passed"
});
formatter.match({
  "location": "FuncionarioSteps.oSistemaExibiráAMensagem()"
});
formatter.result({
  "duration": 1388779199,
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 919176900,
  "status": "passed"
});
formatter.after({
  "duration": 3951190400,
  "status": "passed"
});
formatter.uri("004_cadastrar_empregado_api.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Cadastrar empregado pela API",
  "description": "",
  "id": "cadastrar-empregado-pela-api",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@api"
    }
  ]
});
formatter.before({
  "duration": 31600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Deve cadastrar um empregado pela Api",
  "description": "",
  "id": "cadastrar-empregado-pela-api;deve-cadastrar-um-empregado-pela-api",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 4,
      "name": "@cadastrar_empregado_api"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "que o usuário cadastre um empregado com admissao \"20/02/2020\", cargo \"Analista\", comissao \"0,00\", cpf \"929.376.570-52\" departamentoId 1, nome \"Fernando Avila FEITO PELA API NAO DELETAR\", salario \"1.000,00\", sexo \"m\" e tipo de contratacao \"clt\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "o status code ao cadastrar um empregado deve ser 202 e me retornar o empregado com nome \"Fernando Avila FEITO PELA API NAO DELETAR\"",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "20/02/2020",
      "offset": 50
    },
    {
      "val": "Analista",
      "offset": 70
    },
    {
      "val": "0,00",
      "offset": 91
    },
    {
      "val": "929.376.570-52",
      "offset": 103
    },
    {
      "val": "1",
      "offset": 134
    },
    {
      "val": "Fernando Avila FEITO PELA API NAO DELETAR",
      "offset": 143
    },
    {
      "val": "1.000,00",
      "offset": 196
    },
    {
      "val": "m",
      "offset": 213
    },
    {
      "val": "clt",
      "offset": 239
    }
  ],
  "location": "CadastrarEmpregadoApiSteps.queOUsuárioCadastreUmEmpregadoComAdmissaoCargoComissaoCpfDepartamentoIdNomeSalarioSexoETipoDeContratacao(String,String,String,String,int,String,String,String,String)"
});
formatter.result({
  "duration": 8250600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "202",
      "offset": 49
    },
    {
      "val": "Fernando Avila FEITO PELA API NAO DELETAR",
      "offset": 89
    }
  ],
  "location": "CadastrarEmpregadoApiSteps.oStatusCodeAoCadastrarUmEmpregadoDeveSerEMeRetornarOEmpregadoComNome(int,String)"
});
formatter.result({
  "duration": 4906656901,
  "status": "passed"
});
formatter.after({
  "duration": 336800,
  "status": "passed"
});
formatter.uri("005_listar_empregado_cadastrado_api.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Listar empregado cadastrado pela API",
  "description": "",
  "id": "listar-empregado-cadastrado-pela-api",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@api"
    }
  ]
});
formatter.before({
  "duration": 41601,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Deve listar um empregado cadastrado pela Api",
  "description": "",
  "id": "listar-empregado-cadastrado-pela-api;deve-listar-um-empregado-cadastrado-pela-api",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 4,
      "name": "@listar_empregado_cadastrado_api"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "que o usuário deseja consultar o último empregado cadastrado",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "o status code ao consultar um empregado deve ser 202 e retornar o nome do usuário",
  "keyword": "Entao "
});
formatter.match({
  "location": "ListarEmpregadoCadastradoApiSteps.queOUsuárioDesejaConsultarOÚltimoEmpregadoCadastrado()"
});
formatter.result({
  "duration": 150300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "202",
      "offset": 49
    }
  ],
  "location": "ListarEmpregadoCadastradoApiSteps.oStatusCodeAoConsultarUmEmpregadoDeveSerERetornarONomeDoUsuário(int)"
});
formatter.result({
  "duration": 4624121900,
  "status": "passed"
});
formatter.after({
  "duration": 97100,
  "status": "passed"
});
formatter.uri("006_listar_todos_empregados_api.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Listar todos empregados cadastrados pela API",
  "description": "",
  "id": "listar-todos-empregados-cadastrados-pela-api",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@api"
    }
  ]
});
formatter.before({
  "duration": 74900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Deve listar todos empregados cadastrados pela Api",
  "description": "",
  "id": "listar-todos-empregados-cadastrados-pela-api;deve-listar-todos-empregados-cadastrados-pela-api",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 4,
      "name": "@listar_todos_empregados_api"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "que o usuário deseja listar todos os empregados cadastrados",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "o status code ao listar todos os empregados deve ser 200 e a lista deve ser maior que 0 ocorrências",
  "keyword": "Entao "
});
formatter.match({
  "location": "ListaTodosEmpregadosApiSteps.queOUsuárioDesejaListarTodosOsEmpregadosCadastrados()"
});
formatter.result({
  "duration": 282200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 53
    },
    {
      "val": "0",
      "offset": 86
    }
  ],
  "location": "ListaTodosEmpregadosApiSteps.oStatusCodeAoListarTodosOsEmpregadosDeveSerEAListaDeveSerMaiorQueOcorrências(int,int)"
});
formatter.result({
  "duration": 1413683199,
  "status": "passed"
});
formatter.after({
  "duration": 280000,
  "status": "passed"
});
formatter.uri("007_alterar_empregado_api.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Alterar empregado cadastrado pela API",
  "description": "",
  "id": "alterar-empregado-cadastrado-pela-api",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@api"
    }
  ]
});
formatter.before({
  "duration": 87801,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Deve alterar um empregado cadastrados pela Api",
  "description": "",
  "id": "alterar-empregado-cadastrado-pela-api;deve-alterar-um-empregado-cadastrados-pela-api",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 4,
      "name": "@alterar_empregado_api"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "que o usuário deseja alterar o nome \"Empregado Editado API\", o salário \"1.500,00\" e tipo de contratação \"pj\" do ultimo empregado cadastrado",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "o status code ao alterar o empregado deve ser 200 e retornar o nome do empregado editado",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "Empregado Editado API",
      "offset": 37
    },
    {
      "val": "1.500,00",
      "offset": 72
    },
    {
      "val": "pj",
      "offset": 105
    }
  ],
  "location": "AlterarEmpregadoApiSteps.queOUsuárioDesejaAlterarONomeOSalárioETipoDeContrataçãoDoUltimoEmpregadoCadastrado(String,String,String)"
});
formatter.result({
  "duration": 355201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 46
    }
  ],
  "location": "AlterarEmpregadoApiSteps.oStatusCodeAoAlterarOEmpregadoDeveSerERetornarONomeDoEmpregadoEditado(int)"
});
formatter.result({
  "duration": 2797553801,
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nExpected status code \u003c200\u003e but was \u003c400\u003e.\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:80)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.doConstructorInvoke(CachedConstructor.java:74)\r\n\tat org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrap.callConstructor(ConstructorSite.java:84)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallConstructor(CallSiteArray.java:59)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:237)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:249)\r\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure.validate(ResponseSpecificationImpl.groovy:492)\r\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure$validate$1.call(Unknown Source)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.validateResponseIfRequired(ResponseSpecificationImpl.groovy:655)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.codehaus.groovy.runtime.callsite.PlainObjectMetaMethodSite.doInvoke(PlainObjectMetaMethodSite.java:43)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite$PogoCachedMethodSiteNoUnwrapNoCoerce.invoke(PogoMetaMethodSite.java:190)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite.callCurrent(PogoMetaMethodSite.java:58)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:168)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.statusCode(ResponseSpecificationImpl.groovy:125)\r\n\tat io.restassured.specification.ResponseSpecification$statusCode$0.callCurrent(Unknown Source)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.statusCode(ResponseSpecificationImpl.groovy:133)\r\n\tat io.restassured.internal.ValidatableResponseOptionsImpl.statusCode(ValidatableResponseOptionsImpl.java:89)\r\n\tat io.restassured.internal.ValidatableResponseImpl.super$2$statusCode(ValidatableResponseImpl.groovy)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:101)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1217)\r\n\tat org.codehaus.groovy.runtime.ScriptBytecodeAdapter.invokeMethodOnSuperN(ScriptBytecodeAdapter.java:144)\r\n\tat io.restassured.internal.ValidatableResponseImpl.statusCode(ValidatableResponseImpl.groovy:142)\r\n\tat io.restassured.internal.ValidatableResponseImpl.statusCode(ValidatableResponseImpl.groovy)\r\n\tat br.com.inmetrics.teste.testeApi.EmpregadoTestApi.alterarEmpregado(EmpregadoTestApi.java:130)\r\n\tat br.com.inmetrics.teste.steps.AlterarEmpregadoApiSteps.oStatusCodeAoAlterarOEmpregadoDeveSerERetornarONomeDoEmpregadoEditado(AlterarEmpregadoApiSteps.java:26)\r\n\tat ✽.Entao o status code ao alterar o empregado deve ser 200 e retornar o nome do empregado editado(007_alterar_empregado_api.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 97499,
  "status": "passed"
});
});