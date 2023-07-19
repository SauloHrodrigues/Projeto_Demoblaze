package com.demoblaze.test.logic.video_institucional;

import static com.demoblaze.kernel.Contexto.browserWeb;

import org.junit.Assert;

import com.demoblaze.test.pages.video_institucional.VideoInstitucionalPage;

public class VideoInstitucionalLogic {

	VideoInstitucionalPage page;

	public VideoInstitucionalLogic() {
		page = new VideoInstitucionalPage();
	}
	
	public void clicarAboutUs() {
		browserWeb().toClick(page.getLinkAbout());
		browserWeb().toHoperElementVisibility(page.getTxtVideo());
	}
	
	public void validarElementoVideoVisivel()  {
		Assert.assertTrue(page.getTxtVideo().isDisplayed());
	}
}