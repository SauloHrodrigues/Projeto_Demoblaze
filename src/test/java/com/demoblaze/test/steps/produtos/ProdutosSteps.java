package com.demoblaze.test.steps.produtos;

import com.demoblaze.test.logic.produto.ProdutoLogic;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class ProdutosSteps {
	private ProdutoLogic logic = new ProdutoLogic();

	@Quando("^clicar no link \"([^\"]*)\"$")
	public void clicar_no_link(String opcaoLink) throws Throwable {
		logic.clicarLink(opcaoLink);
	}

	@Então("^validar a aparição de ao menos um produto contendo o texto \\(marca\\) 'Dell' em seu título\\.$")
	public void validar_a_aparição_de_ao_menos_um_produto_contendo_o_texto_marca_Dell_em_seu_título() throws Throwable {
		logic.validarProdutoMarcaDell();
	}

	@Então("^clicar no primeiro item$")
	public void clicarNoPrimeiroItem() throws Throwable {
		logic.clicarPrimeiroItem();
	}

	@Então("^clicar no link 'Add to cart'$")
	public void clicarNoLinkAddToCart() throws Throwable {
		logic.adicionarProdutoCarrinho();

	}
	
	@Quando("^clicar no link 'Cart'$")
	public void clicarNoLinkCart() throws Throwable {
	  logic.clicarCart();
	}

	@Então("^validar produto adicionado no carrinho de compras$")
	public void validarProdutoAdicionadoNoCarrinhoDeCompras() throws Throwable {
		logic.validarProdutoCarrinho();
		
	}
	
	@Então("^clicar em 'Home'$")
	public void clicarEmHome() throws Throwable {
	    logic.retornarHome();
	}

	@Então("^validar a soma dos produtos do carrinho de compras$")
	public void validarASomaDosProdutosDoCarrinhoDeCompras() throws Throwable {
		logic.validarSomaProdutos();
		System.out.println("Clicar");
	}
	
	@Quando("^remover do carrinho o produto adicionado$")
	public void removerDoCarrinhoOProdutoAdicionado() throws Throwable {
	    logic.excluirItemCarrinho();
	}

	@Então("^validar se o carrinho de compras se encontra vazio$")
	public void validarSeOCarrinhoDeComprasSeEncontraVazio() throws Throwable {
	   logic.validarCarrinhoVazio();
	}
	@Quando("^remover primeiro item do carrinho$")
	public void removerPrimeiroItemDoCarrinho() throws Throwable {
	   logic.excluirItemCarrinho();
		
	}

	@Então("^validar atualização do valor$")
	public void validarAtualizaçãoDoValor() throws Throwable {
	   logic.validarAtualizaçãoPreco();
	}
	
}
