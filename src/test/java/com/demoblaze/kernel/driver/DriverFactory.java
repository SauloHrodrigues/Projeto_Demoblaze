package com.demoblaze.kernel.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demoblaze.kernel.readers.ConfigurationProprerties;

public class DriverFactory {

	private WebDriver driver;
	private ConfigurationProprerties configuracoes;

	public DriverFactory() {
		configuracoes = new ConfigurationProprerties();		
		System.setProperty("webdriver.chrome.driver", configuracoes.getDriverPath());
		driver = new ChromeDriver();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}