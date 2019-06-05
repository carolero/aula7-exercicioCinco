package br.com.zup.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.zup.modelo.Pais;

public class TestePais {

	public static void main(String[] args) {
		
		// Lista de países 
		List<Pais> listaVizinhos = new ArrayList<Pais>();
		
		// Criando duas instâncias de país
		Pais pais = new Pais("BRA", "Brasil", 8514876);
		Pais segundoPais = new Pais("EUA", "Estados Unidos", 8514876);
		Pais terceiroPais = new Pais("FRA", "França", 8514876);
		Pais quartoPais = new Pais("CAN", "Canada", 8514876);
		
		listaVizinhos.add(segundoPais);
		listaVizinhos.add(terceiroPais);
		listaVizinhos.add(quartoPais);
		
		pais.setPaisesVizinhos(listaVizinhos);
		
		// Adicionando a população dos dois países
		pais.setPopulacao(2000000000);
		segundoPais.setPopulacao(300000000);
		
		// Verificando se os países são iguais
		System.out.println(pais.verifaSaoIguais(segundoPais));
		
		// Verificando densidade populacional
		System.out.println(pais.calculaDensidade(pais.getPopulacao(), pais.getDimensao()));
		
		// Mostrando os países vizinhos
		System.out.println(pais);
		
	}

}
