package com.demoblaze.kernel.utils;

import cucumber.api.Scenario;

public class IdCenariosUtils {
	private String id;
	
	public IdCenariosUtils(Scenario cenario) {
		normalizar(cenario);
	}
	
	private void normalizar(Scenario cenario) {
		String[] aux = (cenario.getSourceTagNames().stream().filter(t -> t.startsWith("@")).findFirst().get()).split("@");
		id= aux[1];	
	}

	public String getId() {
		return id;
	}
}