package com.demoblaze.test.logic.mensagem;

import static com.demoblaze.kernel.Contexto.browserWeb;

import com.demoblaze.test.pages.mensagem.MensagemPage;

public class MensagemLogic {
	private MensagemPage page;

	public MensagemLogic() {
		page = new MensagemPage();
	}
	
	public void clicarContact() {
		browserWeb().toClick(page.getLinkContact());
	}
	
	public void preencherEmail() {
		browserWeb().toHoperElementVisibility(page.getTxtContactEmail());
		browserWeb().toWriter(page.getTxtContactEmail(), "email");
	}
	
	public void preencherNome() {
		browserWeb().toWriter(page.getTxtContactName(), "nome");
	}
	
	public void preencherMensagem() {
		browserWeb().toWriter(page.getTxtMensagem(), "mensagem");
	}
	
	public void clicarBotaoSendMensage() {
		browserWeb().toClick(page.getBtnSendMessage());
	}	
}