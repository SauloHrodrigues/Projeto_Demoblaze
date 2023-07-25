package com.demoblaze.test.steps.compra;

import com.demoblaze.test.logic.compra.CompraLogic;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class ProcessoCompraSteps {
	private CompraLogic logic = new CompraLogic();
	
	@Quando("^clicar em 'Place Order'$")
	public void clicarEmPlaceOrder() throws Throwable {
		logic.clicarPlaceOrder();
	}

	@Então("^preencha o Campo 'Name'$")
	public void preenchaOCampoName() throws Throwable {
	   logic.preencherName();
	}

	@Então("^preencha o Campo 'Country'$")
	public void preenchaOCampoCountry() throws Throwable {
	    logic.preencherCountry();
	}

	@Então("^preencha o Campo 'City'$")
	public void preenchaOCampoCity() throws Throwable {
	   logic.preencherCity();
	}

	@Então("^preencha o Campo 'Credit card'$")
	public void preenchaOCampoCreditCard() throws Throwable {
	    logic.preencherCredtCard();
	}

	@Então("^preencha o Campo 'Month'$")
	public void preenchaOCampoMonth() throws Throwable {
		logic.preencherMonth();
	}

	@Então("^preencha o Campo 'Year'$")
	public void preenchaOCampoYear() throws Throwable {
	    logic.preencherYear();
	}

	@Quando("^clicar no botão 'Purchase'$")
	public void clicarNoBotãoPurchase() throws Throwable {
	   logic.clicarBotaoPurchase();
	}

	@Então("^validar compra concluida$")
	public void validarCompraConcluida() throws Throwable {
		logic.validaCompra();
	}

}
