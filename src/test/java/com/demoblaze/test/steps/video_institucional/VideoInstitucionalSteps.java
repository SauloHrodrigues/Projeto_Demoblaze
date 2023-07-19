package com.demoblaze.test.steps.video_institucional;

import com.demoblaze.test.logic.video_institucional.VideoInstitucionalLogic;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class VideoInstitucionalSteps {
	private VideoInstitucionalLogic videoLogic  = new VideoInstitucionalLogic();

	@Quando("^clicar no link 'About us'$")
	public void clicarNoLinkAboutUs() throws Throwable {
		videoLogic.clicarAboutUs();
	}

	@Então("^validar elemento do video institucional da empresa$")
	public void validarElementoDoVideoInstitucionalDaEmpresa() throws Throwable {
		videoLogic.validarElementoVideoVisivel();		
	}
}