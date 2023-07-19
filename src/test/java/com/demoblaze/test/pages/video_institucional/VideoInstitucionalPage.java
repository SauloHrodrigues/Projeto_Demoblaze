package com.demoblaze.test.pages.video_institucional;

import static com.demoblaze.kernel.Contexto.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VideoInstitucionalPage {
	
	@FindBy(xpath = "//a[@data-target='#videoModal']")
	private WebElement linkAbout;
	
	@FindBy(id = "videoModal")
	private WebElement txtVideo;

	public VideoInstitucionalPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement getLinkAbout() {
		return linkAbout;
	}	
	
	public WebElement getTxtVideo() {
		return txtVideo;
	}	
}