package com.demoblaze.test.pages.produtos;

import static com.demoblaze.kernel.Contexto.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdutosPage {

	@FindBy(xpath = "//a[text()='Laptops']")
	private WebElement linkLaptops;

	@FindBy(xpath = "//h4[@class='card-title']/a[contains(text(),'Dell')]")
	private WebElement produtoDell;

	public ProdutosPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement getLinkLaptops() {
		return linkLaptops;
	}

	public WebElement getProdutoDell() {
		return produtoDell;
	}
		
}