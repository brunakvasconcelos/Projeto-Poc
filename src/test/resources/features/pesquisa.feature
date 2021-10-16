#language:pt
Funcionalidade: : Pesquisa
  Como usuário
  Eu quero  acessar a area de pesquisa
  Para que eu possa pesquisar sobre buttons

@test1
  Cenario: : Fazer pesquisa na area de desenvlvedor do site Trello
    Dado que acsesso a area de desenvolvedores
    Quando clico em search digitando o assunto
    E dou enter
    Entao visualizo o resultado da pesquisa


@testLogin
Cenario: Exibir erro ao tentar logar sem usuario e senha
  Dado que clico em log in
  Quando clico em Continuar
  Entao Exibe mensagem Insira um endereço de e-mail