package br.cefet.jpm_ltv.tcc.view;

import java.util.ArrayList;

import java.util.Scanner;

import br.cefet.jpm_ltv.tcc.dao.CategoriaDao;
import br.cefet.jpm_ltv.tcc.dao.ProdutoDao;
import br.cefet.jpm_ltv.tcc.entidade.Categoria;
import br.cefet.jpm_ltv.tcc.entidade.Produto;

public class ProdutoConsultarPorCategoria extends Consultar{
	public static void exec() {
		Scanner si = new Scanner(System.in);
		ArrayList<Categoria> cList = CategoriaDao.consultarTodos();
		imprimirC(cList);
		System.out.println("\n=== Tela de consulta por categoria ===");
		System.out.print("\nDigite a categoria do produto: ");
		int cod = si.nextInt();
		ArrayList<Produto> pList = ProdutoDao.consultarPorCatg(cod);
		imprimir(pList);
	}
}
