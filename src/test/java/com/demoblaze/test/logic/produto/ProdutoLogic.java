package com.demoblaze.test.logic.produto;

import static com.demoblaze.kernel.Contexto.browserWeb;

import org.junit.Assert;

import com.demoblaze.kernel.Contexto;
import com.demoblaze.test.pages.produtos.ProdutosPage;

public class ProdutoLogic {
	private ProdutosPage page;
	private String descricaoProduto;

	public ProdutoLogic() {
		page = new ProdutosPage();
	}
	
	public void clicarLink(String link) {
		if(link.equalsIgnoreCase("notebook")) {
			Contexto.browserWeb().toClick(page.getLinkLaptops());			
		}else if(link.equalsIgnoreCase("Monitors")) {
			Contexto.browserWeb().toClick(page.getLinkMonitors());
		}
	}

	public void clicarLinkMonitors() {
		Contexto.browserWeb().toClick(page.getLinkMonitors());
	}
	
	public void validarProdutoMarcaDell() {
		Contexto.browserWeb().toHoperElementVisibility(page.getProdutoDell());
		Assert.assertTrue(page.getProdutoDell().isDisplayed());
	}
	
	public void clicarPrimeiroItem() {
//		TODO ESPERAR ATUALIZAR
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		descricaoProduto = page.getLinkPrimeiroProduto().getText();
		System.out.println("Descrição = "+ descricaoProduto);
		Contexto.browserWeb().toClick(page.getLinkPrimeiroProduto());
	}
	
	public void adicionarProdutoCarrinho() {
		Contexto.browserWeb().toHoperElementVisibility(page.getLinkAddToCart());
		Contexto.browserWeb().toClick(page.getLinkAddToCart());
	}
	
	public void clicarCart() {
		Contexto.browserWeb().toClick(page.getLinkCart());
		browserWeb().toHoperElementVisibility(page.getTxtPrecoTotal());
	}
	
	public void validarProdutoCarrinho() {
		Contexto.browserWeb().toHoperElementVisibility(page.getTxtPrimeiroItemCarrinho());
		String aux = page.getTxtPrimeiroItemCarrinho().getText();
		Contexto.browserWeb().toClick(page.getLinkDeletePrimeiroItem());
		Assert.assertTrue(descricaoProduto.contains(aux));	
		System.out.println("Após o assert ");
		excluirItemCarrinho();
	}
	
	public void excluirItemCarrinho() {
		Contexto.browserWeb().toHoperElementVisibility(page.getLinkDeletePrimeiroItem());
		Contexto.browserWeb().toClick(page.getLinkDeletePrimeiroItem());
		Contexto.browserWeb().elementInvisivel(page.getLinkDeletePrimeiroItem());		
	}
	
	public void retornarHome() {
		browserWeb().toHoperElementVisibility(page.getLinkHome());
		browserWeb().toClick(page.getLinkHome());
	}
	
	public void validarSomaProdutos() {
		browserWeb().toHoperElementVisibility(page.getTxtPrecoPrimeiroItem());
		Integer produto01 = Integer.parseInt(page.getTxtPrecoPrimeiroItem().getText());
		Integer produto02 = Integer.parseInt(page.getTxtPrecoSegundoItem().getText());
		Integer somaSite = Integer.parseInt(page.getTxtPrecoTotal().getText());
		
		Assert.assertTrue((produto01+produto02)==somaSite);
		excluirItemCarrinho();
		excluirItemCarrinho();
	}
	
	public void validarCarrinhoVazio() {
//		browserWeb().elementInvisivel(page.getTxtPrecoTotal());
//		System.out.println("Valor total = "+ page.getTxtPrecoTotal().isDisplayed());
		Assert.assertFalse(page.getTxtPrecoTotal().isDisplayed());
	}
}
