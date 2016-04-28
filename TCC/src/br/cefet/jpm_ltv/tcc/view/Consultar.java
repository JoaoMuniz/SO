package br.cefet.jpm_ltv.tcc.view;

import java.util.ArrayList;

import br.cefet.jpm_ltv.tcc.entidade.Categoria;
import br.cefet.jpm_ltv.tcc.entidade.Produto;

public class Consultar {
	public static void imprimir(ArrayList<Produto> pList){
		for (int i = 0; i < pList.size(); i++) {
			if(pList.get(i) != null){
				Produto p = pList.get(i);
				System.out.println("\n - Código: " + p.getCodProd() +
								   "\n - Nome: " + p.getNome() + 
						           "\n - Categoria: " + p.getCategoria().getNome() +
								   "\n - Preço: " + p.getPreco());
			}
		}
	}
	
	public static void imprimir(Produto p){
		if(p != null){
			System.out.println("\n - Código: " + p.getCodProd() +
							   "\n - Nome: " + p.getNome() + 
							   "\n - Categoria: " + p.getCategoria().getNome() +
							   "\n - Preço: " + p.getPreco());
		}
	}
	
	public static void imprimirC(ArrayList<Categoria> cList){
		for (int i = 0; i < cList.size(); i++) {
			if(cList.get(i) != null){
				Categoria c = cList.get(i);
				System.out.println("\n - Código: " + c.getCodCategoria()+ 					               
						           "\n - Nome: " + c.getNome());
			}
		}
	}
	
	public static void imprimirC(Categoria c){
		if(c != null){
			System.out.println("\n - Código: " + c.getCodCategoria()+ 					               
		               		   "\n - Nome: " + c.getNome());
		}
	}
}
