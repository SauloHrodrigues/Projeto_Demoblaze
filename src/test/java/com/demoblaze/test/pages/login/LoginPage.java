package com.demoblaze.test.pages.login;

import static com.demoblaze.kernel.Contexto.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "login2")
	private WebElement linkLogIn;
	
	@FindBy(id = "loginusername")
	private WebElement txtUsername;

	@FindBy(id = "loginpassword")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//div[@id='logInModal']//button[@class='btn btn-primary']")
	private WebElement btnLogin;
	
	@FindBy(id = "nameofuser")
	private WebElement linkNomeUser;//   

//	Construtor
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement getLinkLogIn() {
		return linkLogIn ;
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
	public WebElement getLinkNomeUser() {
		return linkNomeUser;
	}
}
