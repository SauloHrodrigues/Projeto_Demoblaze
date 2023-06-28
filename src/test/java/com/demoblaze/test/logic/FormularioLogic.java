package com.demoblaze.test.logic;

import static com.demoblaze.kernel.Contexto.getDriver;

import com.demoblaze.kernel.Contexto;
import com.demoblaze.kernel.driver.InterationBrowser;
import com.demoblaze.kernel.readers.ConfiguracoesPropriedades;
import com.demoblaze.test.pages.HomePage;

public class FormularioLogic {

	private HomePage home;
	private InterationBrowser browser;

	
	public FormularioLogic() {
//		home = new HomePage();
//		browser = new InterationBrowser();

	}
	
	
	public void acessarSite() {
//		ConfiguracoesPropriedades config = new ConfiguracoesPropriedades();
//		getDriver().get(config.getUrl());
		getDriver().get("https://www.demoblaze.com/");
	}

	public void clicarAbout() {
		browser.toClick(home.getLinkAboutUs());
	}
	
	public void clicarCart() {
		browser.toClick(home.getLinkCart());
	}

	public void clicarLogIn() {
		browser.toClick(home.getLinkLogIn());
	}
	
	public void clicarSingUp() {
		browser.toClick(home.getLinkSingUp());
	}
		
	public void clicarLogOut() {
		browser.toClick(home.getLinkLogOut());
	}
}