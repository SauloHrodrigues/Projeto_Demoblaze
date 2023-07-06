package com.demoblaze.kernel.driver;

import static com.demoblaze.kernel.Contexto.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InterationBrowser {

	private WebDriverWait wait;
	
	public InterationBrowser() {
		int standardTimeWait = 8;//TODO
		wait = new WebDriverWait(getDriver(), Duration.ofSeconds(standardTimeWait));
	}
	
	public void toClick(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	
	public void toWriter(WebElement element, String text) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}
	
	public String getTextElement(WebElement element) {
		toHoperElementVisibility(element);
		return element.getText();
	}
	
//	*************** hoper
	public void toHoperElementVisibility(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void toHoperElement(WebElement element) {
		
	}


	
	public void toHoperAlertPresent() {
		wait.until(ExpectedConditions.alertIsPresent());
//		wait.until(ExpectedConditions.a
	}



	

}
