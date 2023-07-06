package com.demoblaze.test.usuarios;

import static com.demoblaze.kernel.Contexto.browserWeb;
import static com.demoblaze.kernel.Contexto.getDriver;

import org.junit.Assert;
import org.openqa.selenium.Alert;

import com.demoblaze.kernel.Contexto;
import com.demoblaze.test._manager_test.PageManager;



public class UsuariosLogic {

	private PageManager pages;

	public UsuariosLogic() {
		pages = new PageManager();
	}
	
	public void acessarSite() {
		Contexto.acessarSite();
	}
	
	public void clicarLinkSingUp() {
		browserWeb().toClick(pages.homePage().getLinkSingUp());
	}

	public void preencherUsername() {
		browserWeb().toWriter(pages.usuariosPage().getTxtUserName(), "Hebe05");
	}

	public void preencherUsername(String userName) {
		browserWeb().toWriter(pages.usuariosPage().getTxtUserName(), userName);
	}

	public void preencherPassword() {
		browserWeb().toWriter(pages.usuariosPage().getTxtPassword(), "125");
	}
	
	public void preencherPassword(String passWord) {
		browserWeb().toWriter(pages.usuariosPage().getTxtPassword(), passWord);
	}
	
	public void clicarBotaoSignup() {
		browserWeb().toClick(pages.usuariosPage().getBtnSingUp());
	}
	
	public void validarMensagem(String mensagem) throws InterruptedException {
		System.out.println("A mensagem do alerta  = ");
//		Thread.sleep(3000);
		browserWeb().toHoperAlertPresent();
		Alert alerta = getDriver().switchTo().alert();
		Assert.assertEquals(mensagem, alerta.getText());		
	}
}
