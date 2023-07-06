package com.demoblaze.test.apresentacao_video;

import static com.demoblaze.kernel.Contexto.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApresentacaoVideoPage {

	@FindBy(id ="videoModal")//id="example-video_html5_api"
	private WebElement video;

	public ApresentacaoVideoPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement getVideo() {
		return video;
	}
}
