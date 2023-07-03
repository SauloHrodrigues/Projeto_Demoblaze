package com.demoblaze.test.logic;

import static com.demoblaze.kernel.Contexto.browserWeb;
import static com.demoblaze.kernel.Contexto.getDriver;

import org.junit.Assert;

import com.demoblaze.kernel.readers.ConfiguracoesPropriedades;
import com.demoblaze.test.logic.login.Login;
import com.demoblaze.test.pages.PageManager;

public class FormularioLogic {

	
	private PageManager pages;
	private String nomeUsuario;
	private String senhaUsuario;

	
	public FormularioLogic() {
		pages = new PageManager();

	}
	
	
	public void acessarSite() {
		ConfiguracoesPropriedades config = new ConfiguracoesPropriedades();
		getDriver().get(config.getUrl());
	}

	public void clicarAbout() {
		browserWeb().toClick(pages.homePage().getLinkAboutUs());
	}
	
	public void clicarCart() {
		browserWeb().toClick(pages.homePage().getLinkCart());
	}

	public void clicarLogIn() {
		browserWeb().toClick(pages.homePage().getLinkLogIn());
	}
	
	public void clicarSingUp() {
		browserWeb().toClick(pages.homePage().getLinkSingUp());
	}
		
	public void clicarLogOut() {
		browserWeb().toClick(pages.homePage().getLinkLogOut());
	}
	
	public void preencherUsername() {	
		nomeUsuario = "saulo01";
	}
	
	public void preencherPassword() {	
		senhaUsuario = "123";
	}

	public void clicarBotaoLogin() {	
		new Login().logar(nomeUsuario, senhaUsuario, pages);
	}
	
	public void validarLogin() {
		Assert.assertTrue(pages.homePage().getLinkNomeUser().isDisplayed());	
	}
	
	public void clicarLogout() {
		browserWeb().toClick(pages.homePage().getLinkLogOut());
	}

	public void validarNaoLogado() {
		Assert.assertFalse(pages.homePage().getLinkNomeUser().isDisplayed());
	}
	
	
	
	
	
}