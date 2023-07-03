# language: pt
@usuarios
Funcionalidade: Realizar cadastros e validar usuario existente no site 'demoblaze';

   Contexto: Realizar cadastro
		Dado estar no site 'https://www.demoblaze.com'
    E clicar link 'Sign up'
   

  @0003 
  Cenario: Cadastrar Usuário
  	Então preencher 'Username'
    E preencher 'Password'
    Quando clicar em 'Sign up'
  	Então validar frase "Sign up successful."

  @0004
  Cenario: Validar alerta ao tentar cadastrar um usuário já existente na aplicação 
  	Então preencher 'Username' com "USUARIO_EXISTENTE’"
    E preencher 'Password' com "SENHA_EXISTENTE"
    Quando clicar em 'Sign up'
  	Então validar frase "This user already exist."
