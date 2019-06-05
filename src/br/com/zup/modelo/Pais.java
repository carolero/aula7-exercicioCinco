package br.com.zup.modelo;

import java.util.List;

public class Pais {
	
	private String codigoISO;
	private String nome;
	private int populacao;
	private double dimensao;
	private List<Pais> paisesVizinhos;
	
	// Construtor
	public Pais(String codigoISO, String nome, double dimensao) {
		this.codigoISO = codigoISO;
		this.nome = nome;
		this.dimensao = dimensao;
	}
	
	// Getters & Setters
	public String getCodigoISO() {
		return codigoISO;
	}

	public void setCodigoISO(String codigoISO) {
		this.codigoISO = codigoISO;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
	
	public List<Pais> getPaisesVizinhos() {
		return paisesVizinhos;
	}

	public void setPaisesVizinhos(List<Pais> paisesVizinhos) {
		this.paisesVizinhos = paisesVizinhos;
	}

	// Métodos
	public String verifaSaoIguais(Pais pais) {
		
		if (this.getCodigoISO().equalsIgnoreCase(pais.codigoISO)) {
			return "Os países são semelhantes";
		} else {
			return "Os países não são semelhantes";
		}
		
	}
	
	public double calculaDensidade(int pessoas, double dimensao) {
		
		double densidade;
		densidade = pessoas / dimensao;
		
		return densidade;
		
	}
	
	@Override
	public String toString() {
		String modelo = "";
		
		modelo += "Código ISO -> " + this.getCodigoISO() + "\n";
		modelo += "Nome do país -> " + this.getNome() + "\n";
		modelo += "População -> " + this.getPopulacao() + "\n";
		modelo += "Dimensãp -> " + this.getDimensao() + "\n";
		modelo += "Países vizinhos -> " + this.getPaisesVizinhos() + "\n\n";
		
		return modelo;
	}
	
	
	
}
