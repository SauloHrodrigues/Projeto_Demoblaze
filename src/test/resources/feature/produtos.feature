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
		Quando clicar no link "notebook"
		Então validar a aparição de ao menos um produto contendo o texto (marca) 'Dell' em seu título.    
    
  @0008 @ignorar
  Cenario: Adicionar um produto ao carrinho de compras
		Quando clicar no link "Monitors"
		Então clicar no primeiro item
		E clicar no link 'Add to cart'
		Quando validar frase "Product added."
		Quando clicar no link 'Cart'
		Então validar produto adicionado no carrinho de compras  
		
	@0009 @ignorar
  Cenario: Adicionar múltiplos produtos ao carrinho de compras
		Quando clicar no link "Monitors"
		Então clicar no primeiro item
		E clicar no link 'Add to cart'
		Então validar frase "Product added."
		E clicar em 'Home' 
		Quando clicar no link "notebook"
		Então clicar no primeiro item
		E clicar no link 'Add to cart'
		Então validar frase "Product added."
		Quando clicar no link 'Cart'
		Então validar a soma dos produtos do carrinho de compras 

	@0010
  Cenario: Adicionar múltiplos produtos ao carrinho de compras
		Quando clicar no link "Monitors"
		Então clicar no primeiro item
		E clicar no link 'Add to cart'
		Então validar frase "Product added."
		Quando clicar no link 'Cart'
		E remover do carrinho o produto adicionado
		Então validar se o carrinho de compras se encontra vazio 
	
		 