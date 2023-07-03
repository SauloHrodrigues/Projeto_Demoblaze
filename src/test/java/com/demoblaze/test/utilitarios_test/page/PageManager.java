package com.demoblaze.test.utilitarios_test.page;

import com.demoblaze.test.login_logout.LoginPage;
import com.demoblaze.test.usuarios.UsuariosPage;

public class PageManager {
	private HomePage home;
	private LoginPage login;
	private UsuariosPage usuariosPage;

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
}
