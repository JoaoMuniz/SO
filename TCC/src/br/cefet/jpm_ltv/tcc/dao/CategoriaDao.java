package br.cefet.jpm_ltv.tcc.dao;

import java.util.ArrayList;

import br.cefet.jpm_ltv.tcc.entidade.Categoria;

public class CategoriaDao {
	private static ArrayList<Categoria> cList = new ArrayList<Categoria>();
	private static int contador = 0;

	public static void inserir(Categoria c){
		contador++;
		c.setCodCategoria(contador);
		cList.add(c);
	}
	
	public static void alterar(Categoria r){
		for (int i = 0; i < cList.size(); i++) {
			Categoria c = cList.get(i);
			if (c.getCodCategoria() == r.getCodCategoria()) {
				cList.remove(i);
				cList.add(r);
				break;
			}
		}
	}
	
	public static Categoria consultarPorCd(int cod){
		Categoria r = null;
		
		for (int i = 0; i < cList.size(); i++) {
			Categoria c = cList.get(i);
			if (c.getCodCategoria() == cod) {
				r = c;
				break;
			}
		}
		return r;
	}
	
	public static ArrayList<Categoria> consultarPorNome(String nome){
		ArrayList<Categoria> ret = new ArrayList<Categoria>();
		
		for (int i = 0; i < cList.size(); i++) {
			Categoria p = cList.get(i);
			if (p.getNome().startsWith(nome)) {
				ret.add(p);
				break;
			}
		}
		return ret;
	}
	
	public static ArrayList<Categoria> consultarTodos(){
		return cList;
	}
	
	public static void excluir(int cod){
		for (int i = 0; i < cList.size(); i++) {
			Categoria c = cList.get(i);
			if (c.getCodCategoria() == cod){
				cList.remove(i);
				break;
			}
		}
	}
}
