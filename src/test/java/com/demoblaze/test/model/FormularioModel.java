package com.demoblaze.test.model;

import java.util.List;

import com.demoblaze.kernel.Contexto;
import com.demoblaze.kernel.readers.ExcelUtils;

public class FormularioModel {
	private final int CODIGO_CENARIO = 0;
	private final int USUARIO = 1;
	private final int SENHA = 2;
	private final int CONTACT_NAME = 3;
	private final int CONTACT_EMAIL= 4;
	private final int MENSAGEM = 5;
	
	private String planilha = "MassaDados";
	
	private ExcelUtils excel;
	private List<String> registro;
	
	public FormularioModel() {
		excel = new ExcelUtils();
		
//		registro = excel.buscarRegistro(CODIGO_CENARIO ,Contexto.getIdCenario(), this.planilha);
		registro = excel.buscarRegistro(CODIGO_CENARIO ,Contexto.getIdCenario(), planilha);
		excel.closeExcel();	
	}
	
	public String getUsuarioBancoDados() {
		System.out.println("entrou no usuario que = "+ registro.get(USUARIO));
		return registro.get(USUARIO);
	}
	public String getSenhaBancoDados() {
		return registro.get(SENHA);
	}
	public String getContactNameBancoDados() {
		return registro.get(CONTACT_NAME);
	}
	public String getContactEmailBancoDados() {
		return registro.get(CONTACT_EMAIL);
	}
	public String getMensagemBancoDados() {
		return registro.get(MENSAGEM);
	}
	
}
