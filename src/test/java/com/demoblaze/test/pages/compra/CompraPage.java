package com.demoblaze.test.pages.compra;

import static com.demoblaze.kernel.Contexto.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompraPage {

	
	@FindBy(id = "orderModal")
	private WebElement container;
	
	@FindBy(id = "name")
	private WebElement txtName;
	
	@FindBy(id = "country")
	private WebElement txtCountry;
	
	@FindBy(id = "city")
	private WebElement txtCiy;
	
	@FindBy(id = "card")
	private WebElement txtCredCard;
	
	@FindBy(id = "month")
	private WebElement txtMoth;
	
	@FindBy(id = "year")
	private WebElement txtYear;
	
	@FindBy(xpath = "//button[text()='Purchase']")
	private WebElement btnPurchase;

	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement btnPlaceOrder;

	@FindBy(xpath = "//h2[text()='Thank you for your purchase!']")
	private WebElement msgSucesso;

	//construtor
	public CompraPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement getContainer() {
		return container;
	}

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtCountry() {
		return txtCountry;
	}

	public WebElement getTxtCiy() {
		return txtCiy;
	}

	public WebElement getTxtCredCard() {
		return txtCredCard;
	}

	public WebElement getTxtMoth() {
		return txtMoth;
	}

	public WebElement getTxtYear() {
		return txtYear;
	}

	public WebElement getBtnPurchase() {
		return btnPurchase;
	}

	public WebElement getBtnPlaceOrder() {
		return btnPlaceOrder;
	}

	public WebElement getMsgSucesso() {
		return msgSucesso;
	}
	
	
}
