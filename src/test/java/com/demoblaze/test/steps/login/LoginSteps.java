package com.demoblaze.test.steps.login;

import com.demoblaze.kernel.Contexto;
import com.demoblaze.test.logic.login.LoginLogic;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {
	private LoginLogic logic = new LoginLogic();

	
	@Dado("^estar no site 'https://www\\.demoblaze\\.com'$")
	public void estar_no_site_https_www_demoblaze_com() throws Throwable {
		Contexto.acessarSite();
	}

	@Quando("^clicar no link 'Log in'$")
	public void clicar_no_link_Log_in() throws Throwable {
		logic.clicarLog_in();
		
	}

	@Quando("^preencher a caixa 'Username'$")
	public void preencher_a_caixa_Username() throws Throwable {
		logic.preencherUser_name();
	}

	@Quando("^prencher a caixa de texto 'Password'$")
	public void prencher_a_caixa_de_texto_Password() throws Throwable {
		logic.preencherPass_word();
	}

	@Quando("^clicar no botão 'Log in'$")
	public void clicar_no_botão_Log_in() throws Throwable {
		logic.clicarBotaoLogin();
	}

	@Então("^validar usuario logado\\.$")
	public void validar_usuario_logado() throws Throwable {
		logic.validarLogin();
	}
}