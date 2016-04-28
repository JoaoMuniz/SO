package br.cefet.jpm_ltv.tcc.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.cefet.jpm_ltv.tcc.dao.CategoriaDao;
import br.cefet.jpm_ltv.tcc.entidade.Categoria;

public class CategoriaExcluir extends Consultar {
	public static void exec() {
		Scanner ss = new Scanner(System.in);

		ArrayList<Categoria> cList = CategoriaDao.consultarTodos();
		imprimirC(cList);
		System.out.println("\n=== Tela de exclus�o ===");
		System.out.print("Digite o c�digo da categoria a ser exclu�da: ");
		int cod = ss.nextInt();
		CategoriaDao.excluir(cod);
		
	}
}
