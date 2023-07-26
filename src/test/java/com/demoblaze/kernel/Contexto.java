package com.demoblaze.kernel;

import org.openqa.selenium.WebDriver;

import com.demoblaze.kernel.driver.DriverFactory;
import com.demoblaze.kernel.driver.InterationBrowser;
import com.demoblaze.kernel.readers.ConfigurationProprerties;
import com.demoblaze.kernel.utils.IdCenariosUtils;

import cucumber.api.Scenario;


public class Contexto {

	private static DriverFactory construtorDriver;
	private static IdCenariosUtils idCenariosUtils;
	private static InterationBrowser browser;
	

	public static void inicializar(Scenario scenario) {
		setConstrutorDriver();
		setIdCenario(scenario);//01
		
	}

	private static void setConstrutorDriver() {
		construtorDriver = new DriverFactory();
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
	
	public static void acessarSite() {
		ConfigurationProprerties config = new ConfigurationProprerties();
		getDriver().get(config.getUrl());		
	} 

	public static void finalizar() {
		construtorDriver.killDriver();
		browser = null;
		construtorDriver = null;
		idCenariosUtils = null;
	}
}
