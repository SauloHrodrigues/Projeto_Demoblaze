package com.demoblaze.kernel.driver;

import static com.demoblaze.kernel.Contexto.getDriver;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InterationBrowser {

	private WebDriverWait wait;
	
	public InterationBrowser() {
		wait = new WebDriverWait(getDriver(), Duration.ofSeconds(12));
	}
	
	public void toClick(WebElement element) {
		element.click();
	}

	public void toClickJavaScript(WebElement element) {	
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].click();", element);
	}
	
	public void toWriter(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public String getTextElement(WebElement element) {
		return element.getText();
	}
	
//	*************** hoper
	public void toHoperElementVisibility(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));	
	}
	
	public void toHoperElementClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));	
	}

	public boolean elementInvisivel(WebElement element ) {
		return wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public void toHoperAlertPresent() {
		wait.until(ExpectedConditions.alertIsPresent());
	}
}