package br.cefet.jpm_ltv.tcc.view;

import java.util.Scanner;

public class CategoriaMenu {
	public static void exec() {

		Scanner si = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		int op = 0;

		while (op != 6) {
			System.out.println("\n===========Menu=============");
			System.out.println("0 - Cadastro de categorias");
			System.out.println("1 - Consultar todos");
			System.out.println("2 - Consultar por nome");
			System.out.println("3 - Consultar por código");
			System.out.println("4 - Alterar categoria");
			System.out.println("5 - Excluir");
			System.out.println("6 - Sair");
			System.out.println("============================\n");
			System.out.print("Digite uma opção: ");
			op = si.nextInt();

			if (op == 0) {
				CategoriaInserir.exec();
			} else if (op == 1) {
				CategoriaConsultarTodos.exec();
			} else if (op == 2) {
				CategoriaConsultarPorNome.exec();
			} else if (op == 3) {
				CategoriaConsultarPorCod.exec();
			} else if (op == 4) {
				CategoriaAlterar.exec();
			} else if (op == 5) {
				CategoriaExcluir.exec();
			}
		}
	}
}
