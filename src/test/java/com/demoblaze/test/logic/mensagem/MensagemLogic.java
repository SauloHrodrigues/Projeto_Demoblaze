package com.demoblaze.test.logic.mensagem;

import static com.demoblaze.kernel.Contexto.browserWeb;

import com.demoblaze.test.model.FormularioModel;
import com.demoblaze.test.pages.mensagem.MensagemPage;

public class MensagemLogic {
	private MensagemPage page;
	private FormularioModel model;

	public MensagemLogic() {
		page = new MensagemPage();
		model = new FormularioModel();
	}
	
	public void clicarContact() {
		browserWeb().toClick(page.getLinkContact());
	}
	
	public void preencherEmail() {
		browserWeb().toHoperElementVisibility(page.getTxtContactEmail());
		browserWeb().toWriter(page.getTxtContactEmail(), model.getEmailBancoDados());
	}
	
	public void preencherNome() {
		browserWeb().toWriter(page.getTxtContactName(), model.getNomeBancoDados());
	}
	
	public void preencherMensagem() {
		browserWeb().toWriter(page.getTxtMensagem(), model.getMensagemBancoDados());
	}
	
	public void clicarBotaoSendMensage() {
		browserWeb().toClick(page.getBtnSendMessage());
	}	
}