package br.cefet.jpm_ltv.tcc.dao;

import java.util.ArrayList;

import br.cefet.jpm_ltv.tcc.entidade.Produto;

public class ProdutoDao {
	private static ArrayList<Produto> pList = new ArrayList<Produto>();
	private static int contador = 0;
	
	public static void inserir(Produto p){
		contador++;
		p.setCodProd(contador);
		pList.add(p);
	}
	
	public static void alterar(Produto r){
		for (int i = 0; i < pList.size(); i++) {
			Produto p = pList.get(i);
			if (p.getCodProd() == r.getCodProd()) {
				pList.remove(i);
				pList.add(r);
				break;
			}
		}
	}
	
	public static Produto consultarPorCd(int cod){
		Produto r = null;
		
		for (int i = 0; i < pList.size(); i++) {
			Produto p = pList.get(i);
			if (p.getCodProd() == cod) {
				r = p;
				break;
			}
		}
		return r;
	}
	
	public static ArrayList<Produto> consultarPorCatg(int cod){
		ArrayList<Produto> ret = new ArrayList<Produto>();
		
		for (int i = 0; i < pList.size(); i++) {
			Produto p = pList.get(i);
			if (p.getCategoria().getCodCategoria() == cod) {
				ret.add(p);
				break;
			}
		}
		return ret;

	}
	
	public static ArrayList<Produto> consultarPorNome(String nome){
		ArrayList<Produto> ret = new ArrayList<Produto>();
		
		for (int i = 0; i < pList.size(); i++) {
			Produto p = pList.get(i);
			if (p.getNome().startsWith(nome)) {
				ret.add(p);
			}
		}
		return ret;
	}
	
	public static ArrayList<Produto> consultarTodos(){
		return pList;
	}
	
	public static void excluir(int cod){
		for (int i = 0; i < pList.size(); i++) {
			Produto p = pList.get(i);
			if (p.getCodProd() == cod){
				pList.remove(i);
				break;
			}
		}
	}
}
