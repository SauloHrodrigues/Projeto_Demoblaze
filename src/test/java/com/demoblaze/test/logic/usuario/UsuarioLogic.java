package com.demoblaze.test.logic.usuario;

import static com.demoblaze.kernel.Contexto.browserWeb;

import org.junit.Assert;
import org.openqa.selenium.Alert;

import com.demoblaze.kernel.Contexto;
import com.demoblaze.test.pages.usuario.UsuarioPage;

public class UsuarioLogic {
	private UsuarioPage page;

	public UsuarioLogic() {
		page = new UsuarioPage();
	}
	
	public void clicarLinkSignUp() {
		browserWeb().toClick(page.getLinkSingUp());
	}
	
	public void preencherUserName() {
		preencherUserName("blablabla05");//TODO Futuro excel
	}
	public void preencherUserName(String userName) {
		browserWeb().toWriter(page.getTxtUserName(), userName);
	}
	
	public void preencherPassWord() {
		preencherPassWord("123");//TODO Futuro excel
	}

	public void preencherPassWord(String passWord) {
		browserWeb().toWriter(page.getTxtPassWord(), passWord);
	}
	
	public void clicarBotaoSignUp() {
		browserWeb().toClick(page.getBtnSignUp());
		
	}
	
	public void validarMensagem(String msgEsperada) {
		browserWeb().toHoperAlertPresent();
		Alert alerta = Contexto.getDriver().switchTo().alert();
		Assert.assertEquals(msgEsperada, alerta.getText());
	}
	
}