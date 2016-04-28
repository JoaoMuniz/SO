package br.cefet.jpm_ltv.tcc.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.cefet.jpm_ltv.tcc.dao.ProdutoDao;
import br.cefet.jpm_ltv.tcc.entidade.Produto;

public class ProdutoConsultarPorNome extends Consultar{
	public static void exec() {
		Scanner ss = new Scanner(System.in);
		System.out.println("\n=== Tela de consulta por nome ===");
		System.out.print("\nDigite o nome do produto: ");
		String nome = ss.nextLine();
		ArrayList<Produto> pList = ProdutoDao.consultarPorNome(nome);
		imprimir(pList);
	}
}
