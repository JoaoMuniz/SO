package br.cefet.jpm_ltv.tcc.entidade;

public class Produto {
	private String nome;
	private Categoria categoria;
	private int codprod;
	private double preco;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getCodProd() {
		return codprod;
	}
	
	public void setCodProd(int cdprod) {
		this.codprod = cdprod;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
