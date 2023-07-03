package com.demoblaze.test.logic.login;

import static com.demoblaze.kernel.Contexto.browserWeb;

import com.demoblaze.test.pages.PageManager;

public class Login {

	public void logar(String nomeUsuario, String senhaUsuario, PageManager page ) {
		browserWeb().toWriter(page.loginPage().getTxtUsername(), nomeUsuario);
		browserWeb().toWriter(page.loginPage().getTxtPassword(), senhaUsuario );
		browserWeb().toClick(page.loginPage().getBtnLogin());
		browserWeb().toHoperElementVisibility(page.homePage().getLinkNomeUser());
	}
}
