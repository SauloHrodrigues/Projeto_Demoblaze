package com.demoblaze.test.steps.logout;

import com.demoblaze.test.logic.logout.LogoutLogic;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LogoutSteps {
	private LogoutLogic logic = new LogoutLogic();
	
//	@Quando("^clicar no link 'Log out'$")
//	public void clicarNoLinkLogOut() throws Throwable {
//		logic.clicarLogout();
//	}
//
//	@Então("^validar usuario não mais logado$")
//	public void validarUsuarioNãoMaisLogado() throws Throwable {
//	   logic.validarLogout();
//	}
	
	@Quando("^clicar no link 'Log out'$")
	public void clicar_no_link_Log_out() throws Throwable {
		logic.clicarLogout();
	}

	@Então("^validar usuario não mais logado$")
	public void validar_usuario_não_mais_logado() throws Throwable {
		logic.validarLogout();
	}
}
