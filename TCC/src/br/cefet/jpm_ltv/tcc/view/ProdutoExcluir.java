package br.cefet.jpm_ltv.tcc.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.cefet.jpm_ltv.tcc.dao.ProdutoDao;
import br.cefet.jpm_ltv.tcc.entidade.Produto;

public class ProdutoExcluir extends Consultar{
	public static void exec() {
		Scanner ss = new Scanner(System.in);
		
		ArrayList<Produto> pList = ProdutoDao.consultarTodos();
		imprimir(pList);
		System.out.println("\n=== Tela de exclusão ===");
		System.out.print("Digite o código do produto a ser excluído: ");
		int cod = ss.nextInt();
		ProdutoDao.excluir(cod);
	}
}
