#language:pt
# encoding: utf-8
Funcionalidade: Pesquisa
  Como usuario
  Eu quero  acessar a area de pesquisa
  Para que eu possa pesquisar sobre determinado assunto

@ignore
  Cenario: Fazer pesquisa na area de desenvolvedor do site Trello
    Dado que acsesso a area de desenvolvedores
    Quando clico em search digitando o assunto
    E dou enter
    Entao visualizo o resultado da pesquisa

@testLogin
Cenario: Exibir erro ao tentar logar sem usuario e senha
  Dado que clico em login
  Quando clico em Continuar
  Entao Exibe mensagem Insira um endereco de email