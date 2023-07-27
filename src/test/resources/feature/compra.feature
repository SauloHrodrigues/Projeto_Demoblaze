#language: pt
Funcionalidade: efetivar compra no site 'demoblaze';

 	Contexto: Fazer login
   	Dado estar no site 'https://www.demoblaze.com'
    Quando clicar no link 'Log in'
    E preencher a caixa 'Username'
    E prencher a caixa de texto 'Password'
    E clicar no botão 'Log in'
    Quando clicar no link "Monitors"
		Então clicar no primeiro item
		E clicar no link 'Add to cart'
		Então validar frase "Product added."
		E clicar em 'Home' 
		Quando clicar no link "Laptops"
		Então clicar no primeiro item
		E clicar no link 'Add to cart'
		Então validar frase "Product added."
	
	@0012  
  Cenario: Adicionar múltiplos produtos ao carrinho de compras
  		Quando clicar no link 'Cart'
  		E clicar em 'Place Order'
  		Então preencha o Campo 'Name'
  		E preencha o Campo 'Country'
  		E preencha o Campo 'City'
  		E preencha o Campo 'Credit card'
  		E preencha o Campo 'Month'
  		E preencha o Campo 'Year'
  		Quando clicar no botão 'Purchase'
  		Então validar compra concluida