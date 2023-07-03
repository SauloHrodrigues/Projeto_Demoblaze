package com.demoblaze.test.utilitarios_test.logics.copy;

import static com.demoblaze.kernel.Contexto.getDriver;

public class FormularioLogic {
	public void acessarSite() {
//		ConfiguracoesPropriedades config = new ConfiguracoesPropriedades();
//		getDriver().get(config.getUrl());
		getDriver().get("https://www.demoblaze.com/");
	}
}
