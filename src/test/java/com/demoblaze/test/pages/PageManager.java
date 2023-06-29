package com.demoblaze.test.pages;

public class PageManager {
	private HomePage home;
	private LoginPage login;


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
	
	
	
	
}
