package com.demoblaze.test._manager_test;

import com.demoblaze.test.apresentacao_video.ApresentacaoVideoPage;
import com.demoblaze.test.login_logout.LoginPage;
import com.demoblaze.test.usuarios.UsuariosPage;

public class PageManager {
	private HomePage home;
	private LoginPage login;
	private UsuariosPage usuariosPage;
	private ApresentacaoVideoPage videoPage;

	public HomePage homePage() {
		
		if(home==null) {
			home = new HomePage();
		}
		
		return home;
	}

	public LoginPage loginPage() {
		if(login == null) {
			login = new LoginPage();
		}
		return login;
	}
	
	public UsuariosPage usuariosPage() {
		if(usuariosPage == null) {
			this.usuariosPage = new UsuariosPage();
		}
		return usuariosPage;
	}

	public ApresentacaoVideoPage videoPage() {
		if(videoPage == null) {
			this.videoPage = new ApresentacaoVideoPage();
		}
		return videoPage;
	}
}
