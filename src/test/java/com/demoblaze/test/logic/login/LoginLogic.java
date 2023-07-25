package com.demoblaze.test.logic.login;

import static com.demoblaze.kernel.Contexto.browserWeb;

import org.junit.Assert;

import com.demoblaze.test.model.FormularioModel;
import com.demoblaze.test.pages.login.LoginPage;

public class LoginLogic {
	private LoginPage page;
	private String nomeUsuario = "saulo01";
	private String senhaUsuario = "123";
//	private FormularioModel form;

	public LoginLogic() {
		page= new LoginPage();
//		form = new FormularioModel();
	}

	public void clicarLog_in() {
		browserWeb().toClick(page.getLinkLogIn());
	}
	
	public void preencherUser_name() {
		browserWeb().toHoperElementVisibility(page.getTxtUsername());
		browserWeb().toWriter(page.getTxtUsername(), nomeUsuario);
//		browserWeb().toWriter(page.getTxtUsername(), form.getUsuarioBancoDados());
	}
	
	public void preencherPass_word() {
		browserWeb().toWriter(page.getTxtPassword(), senhaUsuario);
//		browserWeb().toWriter(page.getTxtPassword(), form.getSenhaBancoDados());
	}
	
	public void clicarBotaoLogin() {

		browserWeb().toHoperElementVisibility(page.getBtnLogin());
		browserWeb().toClick(page.getBtnLogin());	
		browserWeb().toHoperElementVisibility(page.getLinkNomeUser());
	}
	
	public void validarLogin() {
		
		Assert.assertTrue(page.getLinkNomeUser().isDisplayed());
	}
}
