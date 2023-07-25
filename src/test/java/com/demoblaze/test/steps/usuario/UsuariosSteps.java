package com.demoblaze.test.steps.usuario;

import com.demoblaze.test.logic.usuario.UsuarioLogic;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class UsuariosSteps {
	private UsuarioLogic usuarioLogic = new UsuarioLogic();
	
	@Quando("^clicar no link 'Sing up'$")
	public void clicar_no_link_Sing_up() throws Throwable {
		usuarioLogic.clicarLinkSignUp();
	}

	@Quando("^preencher um novo 'Username'$")
	public void preencher_um_novo_Username() throws Throwable {
		   usuarioLogic.preencherUserName();
		   
	}

	@Quando("^preencher um novo 'Password'$")
	public void preencher_um_novo_Password() throws Throwable {
	    usuarioLogic.preencherPassWord();
	}

	@Quando("^clicar no botao 'Sign up'$")
	public void clicar_no_botao_Sign_up() throws Throwable {
	    usuarioLogic.clicarBotaoSignUp();
	}

	@Então("^validar frase \"([^\"]*)\"$")
	public void validar_frase(String msgEsperada) throws Throwable {
	   usuarioLogic.validarMensagem(msgEsperada);
	}
	
	@Então("^preencher 'Username' com \"([^\"]*)\"$")
	public void preencher_Username_com(String userName) throws Throwable {
	   usuarioLogic.preencherUserName(userName);
	}

	@Então("^preencher 'Password' com \"([^\"]*)\"$")
	public void preencher_Password_com(String passWord) throws Throwable {
	   usuarioLogic.preencherPassWord(passWord);
	}

}
