package com.demoblaze.test.steps.produtos;

import com.demoblaze.test.logic.produto.ProdutoLogic;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class ProdutosSteps {
	private ProdutoLogic logic = new ProdutoLogic();
	
	@Quando("^clicar no link 'notebook'$")
	public void clicar_no_link_notebook() throws Throwable {
	  logic.clicarLinkLaptops();
	}
	@Então("^validar a aparição de ao menos um produto contendo o texto \\(marca\\) 'Dell' em seu título\\.$")
	public void validar_a_aparição_de_ao_menos_um_produto_contendo_o_texto_marca_Dell_em_seu_título() throws Throwable {
	   logic.validarProdutoMarcaDell();
	}
	
}
