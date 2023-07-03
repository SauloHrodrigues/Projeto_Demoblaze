package com.demoblaze.test.login_logout;

import static com.demoblaze.kernel.Contexto.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "loginusername")
	private WebElement txtUsername;

	@FindBy(id = "loginpassword")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//div[@id='logInModal']//button[@class='btn btn-primary']")
	private WebElement btnLogin;

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	
}
