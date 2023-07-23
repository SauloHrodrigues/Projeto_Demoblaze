package com.demoblaze.test.steps.mensagem;

import com.demoblaze.test.logic.mensagem.MensagemLogic;

import cucumber.api.java.pt.Quando;

public class MensagemSteps {
	private MensagemLogic logic = new MensagemLogic();

	@Quando("^clicar no link 'Contact'$")
	public void clicarNoLinkContact() throws Throwable {
		logic.clicarContact();
		
	}

	@Quando("^preencher e-mail 'Contact Email:'$")
	public void preencherEMailContactEmail() throws Throwable {
		logic.preencherEmail();
	}
	
	@Quando("^preencher nome 'Contact Name:'$")
	public void preencherNomeContactName() throws Throwable {
	   logic.preencherNome();
	}


	@Quando("^preencher uma mensagem$")
	public void preencherUmaMensagem() throws Throwable {
		logic.preencherMensagem();
	}

	@Quando("^clicar 'Send mensage'$")
	public void clicarSendMensage() throws Throwable {
		logic.clicarBotaoSendMensage();
	}
}