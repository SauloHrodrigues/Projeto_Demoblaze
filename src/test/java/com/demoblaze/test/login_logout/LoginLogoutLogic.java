package com.demoblaze.test.login_logout;

import static com.demoblaze.kernel.Contexto.browserWeb;

import org.junit.Assert;

import com.demoblaze.test.utilitarios_test.page.PageManager;

public class LoginLogoutLogic {

	
	private PageManager pages;
	private String nomeUsuario;
	private String senhaUsuario;

	
	public LoginLogoutLogic() {
		pages = new PageManager();

	}
	
	
	public void logar(String nomeUsuario, String senhaUsuario) {
		browserWeb().toWriter(pages.loginPage().getTxtUsername(), nomeUsuario);
		browserWeb().toWriter(pages.loginPage().getTxtPassword(), senhaUsuario );
		browserWeb().toClick(pages.loginPage().getBtnLogin());
		browserWeb().toHoperElementVisibility(pages.homePage().getLinkNomeUser());
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
		logar(nomeUsuario, senhaUsuario);
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