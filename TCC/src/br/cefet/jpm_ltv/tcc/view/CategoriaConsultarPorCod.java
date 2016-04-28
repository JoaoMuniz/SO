package br.cefet.jpm_ltv.tcc.view;

import java.util.Scanner;

import br.cefet.jpm_ltv.tcc.dao.CategoriaDao;
import br.cefet.jpm_ltv.tcc.entidade.Categoria;

public class CategoriaConsultarPorCod extends Consultar {
	public static void exec() {
		Scanner si = new Scanner(System.in);
		System.out.println("\n=== Tela de consulta categoria ===");
		System.out.print("\nDigite o código da categoria: ");
		int cod = si.nextInt();
		Categoria c = CategoriaDao.consultarPorCd(cod);
		if (c != null){
			imprimirC(c);
		} else {
			System.out.println("Categoria não encontrada.");
		}
	}
}
