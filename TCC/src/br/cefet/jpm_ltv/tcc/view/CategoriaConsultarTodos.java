package br.cefet.jpm_ltv.tcc.view;

import java.util.ArrayList;
import br.cefet.jpm_ltv.tcc.dao.CategoriaDao;
import br.cefet.jpm_ltv.tcc.entidade.Categoria;

public class CategoriaConsultarTodos extends Consultar{
	public static void exec() {
		ArrayList<Categoria> cList = CategoriaDao.consultarTodos();
		imprimirC(cList);
	}
}