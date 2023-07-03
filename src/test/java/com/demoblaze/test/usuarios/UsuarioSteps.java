package com.demoblaze.test.usuarios;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class UsuarioSteps {
	@Dado("^clicar link 'Sign up'$")
	public void clicar_link_Sign_up() throws Throwable {
	   System.out.println("Teste Usuarios");
	}

	@Então("^preencher 'Username'$")
	public void preencher_Username() throws Throwable {
	   
	}

	@Então("^preencher 'Password'$")
	public void preencher_Password() throws Throwable {
	   
	}

	@Quando("^clicar em 'Sign up'$")
	public void clicar_em_Sign_up() throws Throwable {
	
	}

	@Então("^validar frase \"([^\"]*)\"$")
	public void validar_frase(String arg1) throws Throwable {
	 
	}

	@Então("^preencher 'Username' com \"([^\"]*)\"$")
	public void preencher_Username_com(String arg1) throws Throwable {
	   
	}

	@Então("^preencher 'Password' com \"([^\"]*)\"$")
	public void preencher_Password_com(String arg1) throws Throwable {
	   
	}
}
