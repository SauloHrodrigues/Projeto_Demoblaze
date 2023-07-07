package com.demoblaze.test.pages.usuario;

import static com.demoblaze.kernel.Contexto.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsuarioPage {

	@FindBy(id = "signin2")
	private WebElement linkSingUp;

	@FindBy(id = "sign-username")
	private WebElement txtUserName;

	@FindBy(id = "sign-password")
	private WebElement txtPassWord;
	
	@FindBy(id = "logout2")
	private WebElement linkLogOut;	

	@FindBy(xpath = "//button[text()='Sign up']")
	private WebElement btnSignUp;	

	public UsuarioPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement getLinkSingUp() {
		return linkSingUp;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getLinkLogOut() {
		return linkLogOut;
	}

	public WebElement getBtnSignUp() {
		return btnSignUp;
	}
}
