package br.cefet.jpm_ltv.tcc.view;

import java.util.ArrayList;

import java.util.Scanner;

import br.cefet.jpm_ltv.tcc.dao.ProdutoDao;
import br.cefet.jpm_ltv.tcc.entidade.Produto;

public class ProdutoAlterar extends Consultar{
	public static void exec() {
		int cod;
		Scanner si = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		
		ArrayList<Produto> pList = ProdutoDao.consultarTodos();
		imprimir(pList);
		System.out.println("\n=== Tela de altera��o ===");
		System.out.print("Informe o c�digo do produto a ser alterado: ");
		cod = si.nextInt();
		
		 
		Produto r = ProdutoDao.consultarPorCd(cod);
		if (r != null) {
			System.out.print("\nDigite o novo pre�o do produto: ");
			double preco = ss.nextDouble();
			
			r.setPreco(preco);
			
			ProdutoDao.alterar(r);
		} else {
			System.out.println("C�digo inv�lido.");
		}
	}
}
