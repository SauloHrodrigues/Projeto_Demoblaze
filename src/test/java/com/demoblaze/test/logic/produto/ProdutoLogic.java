package com.demoblaze.test.logic.produto;

import org.junit.Assert;

import com.demoblaze.kernel.Contexto;
import com.demoblaze.test.pages.produtos.ProdutosPage;

public class ProdutoLogic {
	private ProdutosPage page;

	public ProdutoLogic() {
		page = new ProdutosPage();
	}
	
	public void clicarLinkLaptops() {
		Contexto.browserWeb().toClick(page.getLinkLaptops());
	}
	
	public void validarProdutoMarcaDell() {
		Contexto.browserWeb().toHoperElementVisibility(page.getProdutoDell());
		Assert.assertTrue(page.getProdutoDell().isDisplayed());
	}
	
}
