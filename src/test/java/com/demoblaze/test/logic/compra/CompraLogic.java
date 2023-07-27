package com.demoblaze.test.logic.compra;

import static com.demoblaze.kernel.Contexto.browserWeb;

import org.junit.Assert;

import com.demoblaze.test.model.FormularioModel;
import com.demoblaze.test.pages.compra.CompraPage;

public class CompraLogic {
	private CompraPage page;
	private FormularioModel model;

	public CompraLogic() {
		page = new CompraPage();
		model = new FormularioModel();
	}
	
	public void clicarPlaceOrder() {
		browserWeb().toClick(page.getBtnPlaceOrder());
		browserWeb().elementInvisivel(page.getContainer());
	}
	
	public void preencherName() {
		browserWeb().toHoperElementVisibility(page.getTxtName());
		browserWeb().toWriter(page.getTxtName(), model.getNomeBancoDados());
	}
	
	public void preencherCountry() {
		browserWeb().toWriter(page.getTxtCountry(), model.getPaisBancoDados());
	}
	
	public void preencherCity() {
		browserWeb().toWriter(page.getTxtCiy(), model.getCidadeBancoDados());
	}
	
	public void preencherCredtCard() {
		browserWeb().toWriter(page.getTxtCredCard(), model.getCartaoCreditoBancoDados());
	}
	
	public void preencherMonth() {
		browserWeb().toWriter(page.getTxtMoth(), model.getMesBancoDados());
	}
	
	public void preencherYear() {
		browserWeb().toWriter(page.getTxtYear(), model.getAnoBancoDados());
	}
	
	public void clicarBotaoPurchase() {
		browserWeb().toClick(page.getBtnPurchase());
	}	
	
	public void validaCompra() {
		browserWeb().toHoperElementVisibility(page.getMsgSucesso());
		Assert.assertTrue(page.getMsgSucesso().isDisplayed());
	}
}