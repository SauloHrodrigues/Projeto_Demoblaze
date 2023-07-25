package com.demoblaze.kernel.hooks;

import java.io.IOException;

import com.demoblaze.kernel.Contexto;
import com.demoblaze.kernel.utils.Evidencia;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	@Before
	public void inicializarTeste(Scenario cenario) {
		Contexto.inicializar(cenario);
	}
	
	@After
	public void finalizaProjeto(Scenario cenario) throws IOException {
//		new Evidencia().capturarTela(cenario);
		Contexto.finalizar();
	}
}
