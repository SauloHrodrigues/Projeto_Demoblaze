#language: pt
Funcionalidade:  Manipular produtos no site 'demoblaze';


 	Contexto: Fazer login
   	Dado estar no site 'https://www.demoblaze.com'
    Quando clicar no link 'Log in'
    E preencher a caixa 'Username'
    E prencher a caixa de texto 'Password'
    E clicar no botão 'Log in'
 
 
  @0007 @ignorar
  Cenario: Validar um produto notebook da marca Dell
		Quando clicar no link 'notebook'
		Então validar a aparição de ao menos um produto contendo o texto (marca) 'Dell' em seu título.    
    