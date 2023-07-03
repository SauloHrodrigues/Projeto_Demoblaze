package com.demoblaze.test.steps._universal_steps;

import com.demoblaze.test.logic.FormularioLogic;

import cucumber.api.java.pt.Dado;

public class EstarSiteSteps {
	private FormularioLogic form = new FormularioLogic();
	
	@Dado("^estar no site 'https://www\\.demoblaze\\.com'$")
	public void estarNoSiteHttpsWwwDemoblazeCom() throws Throwable {
	   form.acessarSite();
	}
}
