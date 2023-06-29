package com.demoblaze.test.logic;

import static com.demoblaze.kernel.Contexto.getDriver;

import com.demoblaze.kernel.driver.InterationBrowser;
import com.demoblaze.kernel.readers.ConfiguracoesPropriedades;
import com.demoblaze.test.pages.HomePage;
import com.demoblaze.test.pages.PageManager;

public class FormularioLogic {

	
	private PageManager pages;
	private InterationBrowser browser;

	
	public FormularioLogic() {
	
		pages = new PageManager();
		browser = new InterationBrowser();

	}
	
	
	public void acessarSite() {
		ConfiguracoesPropriedades config = new ConfiguracoesPropriedades();
		getDriver().get(config.getUrl());
	}

	public void clicarAbout() {
		browser.toClick(pages.homePage().getLinkAboutUs());
	}
	
	public void clicarCart() {
		browser.toClick(pages.homePage().getLinkCart());
	}

	public void clicarLogIn() {
		browser.toClick(pages.homePage().getLinkLogIn());
	}
	
	public void clicarSingUp() {
		browser.toClick(pages.homePage().getLinkSingUp());
	}
		
	public void clicarLogOut() {
		browser.toClick(pages.homePage().getLinkLogOut());
	}
	
	public void preencherEmail() {
		
	}
	
}