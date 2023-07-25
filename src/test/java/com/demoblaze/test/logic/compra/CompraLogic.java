package com.demoblaze.test.logic.compra;

import static com.demoblaze.kernel.Contexto.browserWeb;

import org.junit.Assert;

import com.demoblaze.test.pages.compra.CompraPage;

public class CompraLogic {
	private CompraPage page;

	public CompraLogic() {
		page = new CompraPage();
	}
	
	public void clicarPlaceOrder() {
		browserWeb().toClick(page.getBtnPlaceOrder());
		browserWeb().elementInvisivel(page.getContainer());
	}
	
	public void preencherName() {
		browserWeb().toHoperElementVisibility(page.getTxtName());
		browserWeb().toWriter(page.getTxtName(), "Saulo");
	}
	
	public void preencherCountry() {
		browserWeb().toWriter(page.getTxtCountry(),"Brasil");
	}
	
	public void preencherCity() {
		browserWeb().toWriter(page.getTxtCiy(),"Campinas");
	}
	
	public void preencherCredtCard() {
		browserWeb().toWriter(page.getTxtCredCard(),"222333666");
	}
	
	public void preencherMonth() {
		browserWeb().toWriter(page.getTxtMoth(),"agosto");
	}
	
	public void preencherYear() {
		browserWeb().toWriter(page.getTxtYear(), "2023");
	}
	
	public void clicarBotaoPurchase() {
		browserWeb().toClick(page.getBtnPurchase());
	}	
	
	public void validaCompra() {
		System.out.println("validar");
		browserWeb().toHoperElementVisibility(page.getMsgSucesso());
		Assert.assertTrue(page.getMsgSucesso().isDisplayed());
	}
}