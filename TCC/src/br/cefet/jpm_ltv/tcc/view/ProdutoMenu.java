package br.cefet.jpm_ltv.tcc.view;

import java.util.Scanner;

public class ProdutoMenu {
	public static void exec() {

		Scanner si = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		int op = 0;

		while (op != 7) {
			System.out.println("\n===========Menu=============");
			System.out.println("0 - Cadastro de produtos");
			System.out.println("1 - Consultar todos");
			System.out.println("2 - Consultar por nome");
			System.out.println("3 - Consultar por código");
			System.out.println("4 - Consultar por categoria");
			System.out.println("5 - Alterar produto");
			System.out.println("6 - Excluir");
			System.out.println("7 - Sair");
			System.out.println("============================\n");
			System.out.print("Digite uma opção: ");
			op = si.nextInt();

			if (op == 0) {
				ProdutoInserir.exec();
			} else if (op == 1) {
				ProdutoConsultarTodos.exec();
			} else if (op == 2) {
				ProdutoConsultarPorNome.exec();
			} else if (op == 3) {
				ProdutoConsultarPorCod.exec();
			} else if (op == 4) {
				ProdutoConsultarPorCategoria.exec();
			} else if (op == 5) {
				ProdutoAlterar.exec();
			} else if (op == 6) {
				ProdutoExcluir.exec();
			}
		}
	}
}
