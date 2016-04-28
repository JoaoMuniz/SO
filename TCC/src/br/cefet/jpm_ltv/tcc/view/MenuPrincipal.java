package br.cefet.jpm_ltv.tcc.view;

import java.util.Scanner;

public class MenuPrincipal {
	public static void main(String[] args){
		Scanner si = new Scanner(System.in);
		
		int op = 0;
		
		while(op != 2){
			System.out.println("\n===========Menu=============");
			System.out.println("0 - Categoria");
			System.out.println("1 - Produto");
			System.out.println("2 - Sair");
			System.out.println("============================\n");
			System.out.print("Digite uma opção: ");
			op = si.nextInt();
			
			if (op == 0){
				CategoriaMenu.exec();
			} else if (op == 1){
				ProdutoMenu.exec();
			}
		}
	}
}
