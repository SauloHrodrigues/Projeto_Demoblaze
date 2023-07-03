package com.demoblaze.test.utilitarios_test.steps;

import com.demoblaze.test.utilitarios_test.logics.FormularioLogic;

import cucumber.api.java.pt.Dado;

public class GenericaSteps {
	private FormularioLogic form = new FormularioLogic();
	
	@Dado("^estar no site 'https://www\\.demoblaze\\.com'$")
	public void estarNoSiteHttpsWwwDemoblazeCom() throws Throwable {
		form.acessarSite();
	}
}
