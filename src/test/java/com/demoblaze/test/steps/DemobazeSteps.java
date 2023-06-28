package com.demoblaze.test.steps;

import com.demoblaze.test.logic.FormularioLogic;

import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;

public class DemobazeSteps {
	
	private FormularioLogic form = new FormularioLogic();
	
	@Dado("^estar no site 'https://www\\.demoblaze\\.com'$")
	public void estarNoSiteHttpsWwwDemoblazeCom() throws Throwable {
	   form.acessarSite();
	}

	@Quando("^clicar no link 'Log in'$")
	public void clicarNoLinkLogIn() throws Throwable {
	   
	}

	@Quando("^preencher a caixa 'Username'$")
	public void preencherACaixaUsername() throws Throwable {
	    ;
	}

	@Quando("^prencher a caixa de texto 'Password'$")
	public void prencherACaixaDeTextoPassword() throws Throwable {
	   
	}

	@Quando("^clicar no botão 'Log in'$")
	public void clicarNoBotãoLogIn() throws Throwable {
	   
	}

	@Dado("^estar logado na aplicação$")
	public void estarLogadoNaAplicação() throws Throwable {
	    
	}

	@Então("^validar usuario logado\\.$")
	public void validarUsuarioLogado() throws Throwable {
	 
	}

	@Quando("^clicar no link 'Log out'$")
	public void clicarNoLinkLogOut() throws Throwable {
	   
	}

	@Então("^validar usuario não mais logado$")
	public void validarUsuarioNãoMaisLogado() throws Throwable {
	   
	}
}
