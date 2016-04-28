package br.cefet.jpm_ltv.tcc.view;

import java.util.ArrayList;

import java.util.Scanner;

import br.cefet.jpm_ltv.tcc.dao.CategoriaDao;
import br.cefet.jpm_ltv.tcc.entidade.Categoria;

public class CategoriaConsultarPorNome extends Consultar{
	public static void exec() {
		Scanner ss = new Scanner(System.in);
		System.out.println("\n=== Tela de consulta por categoria ===");
		System.out.print("\nDigite o nome da categoria: ");
		String nome = ss.nextLine();
		ArrayList<Categoria> cList = CategoriaDao.consultarPorNome(nome);
		imprimirC(cList);
	}
}
