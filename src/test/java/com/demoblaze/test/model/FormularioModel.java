package com.demoblaze.test.model;

import java.util.List;

import com.demoblaze.kernel.Contexto;
import com.demoblaze.kernel.readers.ExcelUtils;

public class FormularioModel {
	private final int CODIGO = 0;
	private final int USUARIO = 1;
	private final int SENHA = 2;
	private final int NOME = 3;
	private final int EMAIL= 4;
	private final int PAIS= 5;
	private final int CIDADE =6;
	private final int CARTAO_CREDITO = 7;
	private final int MES = 8;
	private final int ANO = 9;
	private final int MENSAGEM = 10;
	private String planilha = "MassaDados";
	private ExcelUtils excel;
	private List<String> registro;
	
	public FormularioModel() {
		excel = new ExcelUtils();
		registro = excel.buscarRegistro(CODIGO ,Contexto.getIdCenario(), planilha);
		excel.closeExcel();	
	}
	
	public String getUsuarioBancoDados() {
		System.out.println("entrou no usuario que = "+ registro.get(USUARIO));
		return registro.get(USUARIO);
	}
	
	public String getSenhaBancoDados() {
		return registro.get(SENHA);
	}
	
	public String getNomeBancoDados() {
		return registro.get(NOME);
	}
	
	public String getEmailBancoDados() {
		return registro.get(EMAIL);
	}
	
	public String getPaisBancoDados() {
		return registro.get(PAIS);
	}
	
	public String getCidadeBancoDados() {
		return registro.get(CIDADE);
	}
	
	public String getCartaoCreditoBancoDados() {
		return registro.get(CARTAO_CREDITO);
	}
	
	public String getMesBancoDados() {
		return registro.get(MES);
	}
	
	public String getAnoBancoDados() {
		return registro.get(ANO);
	}
	
	public String getMensagemBancoDados() {
		return registro.get(MENSAGEM);
	}
}