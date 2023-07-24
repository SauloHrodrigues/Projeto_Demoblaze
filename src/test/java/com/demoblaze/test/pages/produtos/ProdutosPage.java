package com.demoblaze.test.pages.produtos;

import static com.demoblaze.kernel.Contexto.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdutosPage {
	int x=1;
	@FindBy(xpath = "//a[text()='Laptops']")
	private WebElement linkLaptops;

	@FindBy(xpath = "//a[text()='Monitors']")
	private WebElement linkMonitors;

	@FindBy(xpath = "//div[@id='tbodyid']/div[@class='col-lg-4 col-md-6 mb-4'][1]")
	private WebElement linkPrimeiroProduto;

	@FindBy(xpath = "//a[text()='Add to cart']")
	private WebElement linkAddToCart;

	@FindBy(xpath = "//h4[@class='card-title']/a[contains(text(),'Dell')]")
	private WebElement produtoDell;

	@FindBy(xpath = "//tbody[@id='tbodyid']//a[1]")
	private WebElement linkDeletePrimeiroItem;

	@FindBy(id = "tbodyid")
	private WebElement txtAreaProdutosCarrinho;
	
	
	@FindBy(xpath = "//tbody[@id='tbodyid']//tr[1]/td[2]")
	private WebElement txtPrimeiroItemCarrinho;

	@FindBy(xpath = "//tbody[@id='tbodyid']//tr[1]/td[3]")
	private WebElement txtPrecoPrimeiroItem;

	@FindBy(xpath = "//tbody[@id='tbodyid']//tr[2]/td[3]")
	private WebElement txtPrecoSegundoItem;

	@FindBy(id = "totalp")
	private WebElement txtPrecoTotal;
	
	
	@FindBy(xpath = "//div[@id='navbarExample']//a[text()='Cart']")
	private WebElement linkCart;

	@FindBy(xpath = "//div[@id='navbarExample']//a[text()='Home ']")
	private WebElement linkHome;
	
	

	public ProdutosPage() {
		PageFactory.initElements(getDriver(), this);
	}



	public int getX() {
		return x;
	}



	public WebElement getLinkLaptops() {
		return linkLaptops;
	}



	public WebElement getLinkMonitors() {
		return linkMonitors;
	}



	public WebElement getLinkPrimeiroProduto() {
		return linkPrimeiroProduto;
	}



	public WebElement getLinkAddToCart() {
		return linkAddToCart;
	}



	public WebElement getProdutoDell() {
		return produtoDell;
	}



	public WebElement getLinkDeletePrimeiroItem() {
		return linkDeletePrimeiroItem;
	}



	public WebElement getTxtAreaProdutosCarrinho() {
		return txtAreaProdutosCarrinho;
	}



	public WebElement getTxtPrimeiroItemCarrinho() {
		return txtPrimeiroItemCarrinho;
	}



	public WebElement getTxtPrecoPrimeiroItem() {
		return txtPrecoPrimeiroItem;
	}



	public WebElement getTxtPrecoSegundoItem() {
		return txtPrecoSegundoItem;
	}



	public WebElement getTxtPrecoTotal() {
		return txtPrecoTotal;
	}



	public WebElement getLinkCart() {
		return linkCart;
	}



	public WebElement getLinkHome() {
		return linkHome;
	}


	
	
}