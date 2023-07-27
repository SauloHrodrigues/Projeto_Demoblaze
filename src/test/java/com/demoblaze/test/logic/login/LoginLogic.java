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
//		browserWeb().toHoperElementVisibility(page.getLinkLogIn());
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		browserWeb().toClick(page.getLinkLogIn());
		browserWeb().toClickJavaScript(page.getLinkLogIn());
		
	}
	
	public void preencherUser_name() {
		browserWeb().toHoperElementVisibility(page.getTxtUsername());
		browserWeb().toWriter(page.getTxtUsername(), form.getUsuarioBancoDados());
		
	}
	
	public void preencherPass_word() {
		browserWeb().toWriter(page.getTxtPassword(), form.getSenhaBancoDados());
	}
	
	public void clicarBotaoLogin() {
		browserWeb().toHoperElementVisibility(page.getBtnLogin());
		browserWeb().toClickJavaScript(page.getBtnLogin());	
		browserWeb().toHoperElementVisibility(page.getLinkNomeUser());
	}
	
	public void validarLogin() {			
		Assert.assertTrue(page.getLinkNomeUser().isDisplayed());
	}
}