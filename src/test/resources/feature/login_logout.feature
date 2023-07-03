# language: pt
@loginLogout
Funcionalidade: Realizar login e logout no site 'demoblaze';

  
  Contexto: login logout na aplicação
    Dado estar no site 'https://www.demoblaze.com'
    Quando clicar no link 'Log in'
    E preencher a caixa 'Username'
    E prencher a caixa de texto 'Password'
    E clicar no botão 'Log in'
    
  @0001
  Cenario: login na aplicação
    Dado estar logado na aplicação
    Então validar usuario logado.

  @0002
  Cenario: logout na aplicação
    Quando clicar no link 'Log out'
    Então validar usuario não mais logado
  


