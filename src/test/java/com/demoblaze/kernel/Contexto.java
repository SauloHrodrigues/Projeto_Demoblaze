package com.demoblaze.kernel;

import org.openqa.selenium.WebDriver;

import com.demoblaze.kernel.driver.ConstrutorDriver;
import com.demoblaze.kernel.driver.InterationBrowser;
import com.demoblaze.kernel.utils.IdCenariosUtils;

import cucumber.api.Scenario;


public class Contexto {

	private static ConstrutorDriver construtorDriver;
	private static IdCenariosUtils idCenariosUtils;
	private static InterationBrowser browser;

	public static void inicializar(Scenario scenario) {
		setConstrutorDriver();
//		setIdCenario(scenario);
		
	}

	private static void setConstrutorDriver() {
		construtorDriver = new ConstrutorDriver();
	}

	public static WebDriver getDriver() {
		return construtorDriver.getDriver();

	}

	public static InterationBrowser browserWeb() {
		if(browser == null) {
			browser = new InterationBrowser();
		}
		return browser;
	}
	
	private static void setIdCenario(Scenario cenario) {
		idCenariosUtils = new IdCenariosUtils(cenario);
	}

	public static String getIdCenario() {
		return idCenariosUtils.getId();
	}

	public static void finalizar() {
		construtorDriver.killDriver();
		
		construtorDriver = null;
		idCenariosUtils = null;
	}
}
