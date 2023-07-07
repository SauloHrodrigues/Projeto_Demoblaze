package com.demoblaze.test.pages.logout;

import static com.demoblaze.kernel.Contexto.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	@FindBy(id = "logout2")
	private WebElement linkLogOut;

	public LogoutPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement getLinkLogOut() {
		return linkLogOut;
	}
}
