package br.cefet.jpm_ltv.tcc.view;

import java.util.Scanner;


import br.cefet.jpm_ltv.tcc.dao.CategoriaDao;
import br.cefet.jpm_ltv.tcc.entidade.Categoria;


public class CategoriaInserir {
	
	public static void exec(){
		Scanner ss = new Scanner(System.in);
		
		Categoria aux = new Categoria();
		System.out.println("\n=== Tela de inserção ===");
		System.out.print("Digite o nome da categoria: ");
		String nome = ss.nextLine();
		aux.setNome(nome);
	
		CategoriaDao.inserir(aux);
	}
}
