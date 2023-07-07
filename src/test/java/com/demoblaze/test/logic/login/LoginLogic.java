package com.demoblaze.test.logic.login;

import static com.demoblaze.kernel.Contexto.browserWeb;

import org.junit.Assert;

import com.demoblaze.test.pages.login.LoginPage;

public class LoginLogic {
	private LoginPage page;
	private String nomeUsuario = "saulo01";
	private String senhaUsuario = "123";

	public LoginLogic() {
		page= new LoginPage();			
	}

	public void clicarLog_in() {
		browserWeb().toClick(page.getLinkLogIn());
	}
	
	public void preencherUser_name() {
		browserWeb().toWriter(page.getTxtUsername(), nomeUsuario);
	}
	
	public void preencherPass_word() {
		browserWeb().toWriter(page.getTxtPassword(), senhaUsuario);
	}
	
	public void clicarBotaoLogin() {
//		TODO -> O BOTÃO NÃO ESTA NO DOM, POR ISSO A ESPERA NÃO ESTA FUNCIONANDO CORRETAMENTE
		browserWeb().toHoperElementVisibility(page.getBtnLogin());
		browserWeb().toClick(page.getBtnLogin());
		browserWeb().toHoperElementVisibility(page.getLinkNomeUser());
	}
	
	public void validarLogin() {
		
		Assert.assertTrue(page.getLinkNomeUser().isDisplayed());
	}
}
