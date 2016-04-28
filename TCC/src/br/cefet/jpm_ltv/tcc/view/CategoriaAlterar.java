package br.cefet.jpm_ltv.tcc.view;

import java.util.ArrayList;

import java.util.Scanner;

import br.cefet.jpm_ltv.tcc.dao.CategoriaDao;
import br.cefet.jpm_ltv.tcc.entidade.Categoria;

public class CategoriaAlterar extends Consultar {
	public static void exec() {
		int cod;
		Scanner si = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);

		ArrayList<Categoria> cList = CategoriaDao.consultarTodos();
		imprimirC(cList);
		System.out.println("\n=== Tela de alteração ===");
		System.out.print("Informe o código da categoria a ser alterada: ");
		cod = si.nextInt();

		Categoria r = CategoriaDao.consultarPorCd(cod);
		if (r != null) {
			System.out.print("Digite o novo nome da categoria: ");
			String nome = ss.nextLine();

			r.setNome(nome);

			CategoriaDao.alterar(r);
		} else {
			System.out.println("Código inválido.");
		}
	}
}
