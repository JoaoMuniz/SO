package br.cefet.jpm_ltv.tcc.view;

import java.util.Scanner;

import br.cefet.jpm_ltv.tcc.dao.ProdutoDao;
import br.cefet.jpm_ltv.tcc.entidade.Produto;

public class ProdutoConsultarPorCod extends Consultar {
	public static void exec() {
		Scanner si = new Scanner(System.in);
		System.out.println("\n=== Tela de consulta por c�digo ===");
		System.out.print("\nDigite o c�digo do produto: ");
		int cod = si.nextInt();
		Produto p = ProdutoDao.consultarPorCd(cod);
		if (p != null){
			imprimir(p);
		} else {
			System.out.println("Produto n�o encontrado.");
		}
		
	}
}
