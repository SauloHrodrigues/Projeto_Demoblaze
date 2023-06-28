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
		int standardTimeWait = 20;//TODO
		wait = new WebDriverWait(getDriver(), Duration.ofSeconds(standardTimeWait));
	}
	
	
	public void toClick(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		try {
			if(element.isDisplayed()) {
				element.click();
			}else {
				JavascriptExecutor js = (JavascriptExecutor) getDriver();
				js.executeScript("arguments[0].scroll;", element.getLocation());			
				js.executeScript("arguments[0].click();", element);			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
