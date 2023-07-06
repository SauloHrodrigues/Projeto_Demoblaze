package com.demoblaze.test.apresentacao_video;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;

public class ApresentacaoVideoSteps {
	ApresentacaoVideoLogic video = new ApresentacaoVideoLogic();
	
	@Dado("^acessar site https://www\\.demoblaze\\.com$")
	public void acessar_site_https_www_demoblaze_com() throws Throwable {
		video.acessarSite();
	}

	@Dado("^clicar link 'About us'$")
	public void clicarLinkAboutUs() throws Throwable {
	     video.clicarAboutUs();
	}

	@Então("^validar apapresentação do video institucional da empresa$")
	public void validarApapresentaçãoDoVideoInstitucionalDaEmpresa() throws Throwable {
	  video.validarVideo();
	}
	
}
