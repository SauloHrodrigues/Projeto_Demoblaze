package com.demoblaze.test.pages;

import static com.demoblaze.kernel.Contexto.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsuariosPage {
	
	@FindBy(id = "sign-username")
	private WebElement txtUserName;

	@FindBy(id = "sign-password")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//button[text()='Sign up']")
	private WebElement btnSingUp;
	
	public UsuariosPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnSingUp() {
		return btnSingUp;
	}	
}
