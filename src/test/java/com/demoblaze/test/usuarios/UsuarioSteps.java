package com.demoblaze.test.usuarios;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class UsuarioSteps {
	private UsuariosLogic usuario = new UsuariosLogic();


	@Dado("^acessar o site 'https://www\\.demoblaze\\.com\\.br'$")
	public void acessarOSiteHttpsWwwDemoblazeComBr() throws Throwable {
		usuario.acessarSite(); 
	}

	@Dado("^clicar link 'Sign up'$")
	public void clicar_link_Sign_up() throws Throwable {
		usuario.clicarLinkSingUp();
	}

	@Então("^preencher 'Username'$")
	public void preencher_Username() throws Throwable {
		usuario.preencherUsername();

	}

	@Então("^preencher 'Password'$")
	public void preencher_Password() throws Throwable {
		usuario.preencherPassword();
	}

	@Quando("^clicar em 'Sign up'$")
	public void clicar_em_Sign_up() throws Throwable {
		usuario.clicarBotaoSignup();
	}

	@Então("^validar frase \"([^\"]*)\"$")
	public void validar_frase(String msg) throws Throwable {
		usuario.validarMensagem(msg);
	}

	@Então("^preencher 'Username' com \"([^\"]*)\"$")
	public void preencher_Username_com(String userName) throws Throwable {
		usuario.preencherUsername(userName);
	}

	@Então("^preencher 'Password' com \"([^\"]*)\"$")
	public void preencher_Password_com(String passWord) throws Throwable {
		usuario.preencherPassword(passWord);
	}
}
