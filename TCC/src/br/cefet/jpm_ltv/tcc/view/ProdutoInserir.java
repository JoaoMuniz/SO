package br.cefet.jpm_ltv.tcc.view;

import java.util.ArrayList;
import java.util.Scanner;


import br.cefet.jpm_ltv.tcc.dao.CategoriaDao;
import br.cefet.jpm_ltv.tcc.dao.ProdutoDao;
import br.cefet.jpm_ltv.tcc.entidade.Produto;
import br.cefet.jpm_ltv.tcc.entidade.Categoria;


public class ProdutoInserir extends Consultar {
	
	public static void exec(){
		Scanner si = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		
		Produto aux = new Produto();
		System.out.println("\n=== Tela de inserção ===");
		System.out.print("Digite o nome do produto: ");
		String nome = ss.nextLine();
		aux.setNome(nome);
		ArrayList<Categoria> cList = CategoriaDao.consultarTodos();
		imprimirC(cList);
		System.out.print("\nDigite o código da categoria: ");
		int codCategoria = si.nextInt();
		
		Categoria c = CategoriaDao.consultarPorCd(codCategoria);
		if (c != null){
			aux.setCategoria(c);
			System.out.print("Digite o preço do produto: ");
			double preco = si.nextDouble();
			aux.setPreco(preco);
			
			ProdutoDao.inserir(aux);
		} else {
			System.out.println("Categoria inválida.");
		}
		
		
	}
}
