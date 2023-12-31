package com.demoblaze.test.logic.usuario;

import static com.demoblaze.kernel.Contexto.browserWeb;
import java.util.Random;

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
		Random aleatorio = new Random();
		int valor = aleatorio.nextInt();
		String usuarioAleatorio = "usuario"+valor;		
		preencherUserName(usuarioAleatorio);//TODO Futuro excel
		
	}
	public void preencherUserName(String userName) {
//	TODO acrescentar espera
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		alerta.dismiss();
	}
	
}