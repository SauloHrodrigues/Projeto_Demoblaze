package com.demoblaze.test.login_logout;

import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;

public class LoginLogoutSteps {
	
	private LoginLogoutLogic form = new LoginLogoutLogic();

	@Dado("^estar no site https://www\\.demoblaze\\.com$")
	public void estarNoSiteHttpsWwwDemoblazeCom() throws Throwable {
		form.acessarSite();
	}
	
	@Quando("^clicar no link 'Log in'$")
	public void clicarNoLinkLogIn() throws Throwable {
	   form.clicarLogIn();
	}

	@Quando("^preencher a caixa 'Username'$")
	public void preencherACaixaUsername() throws Throwable {
	    form.preencherUsername();
	}

	@Quando("^prencher a caixa de texto 'Password'$")
	public void prencherACaixaDeTextoPassword() throws Throwable {
	   form.preencherPassword();
	}

	@Quando("^clicar no botão 'Log in'$")
	public void clicarNoBotãoLogIn() throws Throwable {
	   form.clicarBotaoLogin();
	}

	@Dado("^estar logado na aplicação$")
	public void estarLogadoNaAplicação() throws Throwable {
		
	}

	@Então("^validar usuario logado\\.$")
	public void validarUsuarioLogado() throws Throwable {
		form.validarLogin();
	}

	@Quando("^clicar no link 'Log out'$")
	public void clicarNoLinkLogOut() throws Throwable {
	   form.clicarLogout();
	}

	@Então("^validar usuario não mais logado$")
	public void validarUsuarioNãoMaisLogado() throws Throwable {
	   form.validarNaoLogado();
	}
}
