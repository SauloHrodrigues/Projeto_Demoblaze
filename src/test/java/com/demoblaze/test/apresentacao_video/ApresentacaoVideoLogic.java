package com.demoblaze.test.apresentacao_video;

import static com.demoblaze.kernel.Contexto.browserWeb;

import org.junit.Assert;

import com.demoblaze.kernel.Contexto;
import com.demoblaze.test._manager_test.PageManager;

public class ApresentacaoVideoLogic {

	private PageManager pages;

	public ApresentacaoVideoLogic() {
		pages = new PageManager(); 
	}
	
	public void acessarSite() {
		Contexto.acessarSite();
	}
	
	public void clicarAboutUs() {
		browserWeb().toClick(pages.homePage().getLinkAboutUs());
	}
	
	public void validarVideo() {
		browserWeb().toHoperElementVisibility(pages.videoPage().getVideo());
		Assert.assertTrue(pages.videoPage().getVideo().isDisplayed());
	}	
}