#language: pt

Funcionalidade: Cadastro de usuarios 'demoblaze';
    
    Contexto:
    Dado estar no site https://www.demoblaze.com
    Quando clicar no link 'Sing up'
    
  @0003 
  Cenario: Cadastrar Usuário
  	E preencher um novo 'Username'
    E preencher um novo 'Password'
    Quando clicar no botao 'Sign up'
  	Então validar frase "Sign up successful."

	@0004 
  Cenario: Validar usuário já existente na aplicação 
  	Então preencher 'Username' com "USUARIO_EXISTENTE’"
    E preencher 'Password' com "SENHA_EXISTENTE"
    Quando clicar no botao 'Sign up'
  	Então validar frase "This user already exist."  
