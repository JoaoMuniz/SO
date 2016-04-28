package br.cefet.jpm_ltv.tcc.view;

import java.util.ArrayList;


import br.cefet.jpm_ltv.tcc.dao.ProdutoDao;
import br.cefet.jpm_ltv.tcc.entidade.Produto;

public class ProdutoConsultarTodos extends Consultar{
	public static void exec() {
		ArrayList<Produto> pList = ProdutoDao.consultarTodos();
		imprimir(pList);
	}
}