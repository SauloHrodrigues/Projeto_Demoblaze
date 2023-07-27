package com.demoblaze.test.logic.login;

import static com.demoblaze.kernel.Contexto.browserWeb;

import org.junit.Assert;

import com.demoblaze.test.model.FormularioModel;
import com.demoblaze.test.pages.login.LoginPage;

public class LoginLogic {
	private LoginPage page;	
	private FormularioModel form;

	public LoginLogic() {
		page= new LoginPage();
		form = new FormularioModel();
	}

	public void clicarLog_in() {
		browserWeb().toHoperElementVisibility(page.getLinkLogIn());
		browserWeb().toClick(page.getLinkLogIn());	
	}
	
	public void preencherUser_name() {
		browserWeb().toHoperElementVisibility(page.getTxtUsername());
		browserWeb().toWriter(page.getTxtUsername(), form.getUsuarioBancoDados());	
	}
	
	public void preencherPass_word() {
		browserWeb().toWriter(page.getTxtPassword(), form.getSenhaBancoDados());
	}
	
	public void clicarBotaoLogin() {
		
		browserWeb().toHoperElementClickable(page.getBtnLogin());	
		if(page.getBtnLogin().isDisplayed()) {
			browserWeb().toClick(page.getBtnLogin());				
		}else {
			browserWeb().toHoperElementClickable(page.getBtnLogin());
			browserWeb().toClickJavaScript(page.getBtnLogin());
		}
		browserWeb().toHoperElementVisibility(page.getLinkNomeUser());
	}
	
	public void validarLogin() {			
		Assert.assertTrue(page.getLinkNomeUser().isDisplayed());
	}
}