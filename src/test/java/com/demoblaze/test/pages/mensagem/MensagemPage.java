package com.demoblaze.test.pages.mensagem;

import static com.demoblaze.kernel.Contexto.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensagemPage {

	@FindBy(xpath = "//a[@data-target='#exampleModal']")
	private WebElement linkContact;
	
	@FindBy(id = "recipient-email")
	private WebElement txtContactEmail;

	@FindBy(id = "recipient-name")
	private WebElement txtContactName;

	@FindBy(id = "message-text")
	private WebElement txtMensagem;
	
	@FindBy(xpath = "//button[text()='Send message']")
	private WebElement btnSendMessage;
	
//	Contrutor
	public MensagemPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement getLinkContact() {
		return linkContact;
	}
	
	public WebElement getTxtContactEmail() {
		return txtContactEmail;
	}

	public WebElement getTxtContactName() {
		return txtContactName;
	}

	public WebElement getTxtMensagem() {
		return txtMensagem;
	}

	public WebElement getBtnSendMessage() {
		return btnSendMessage;
	}
}