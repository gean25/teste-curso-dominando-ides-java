package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		/*int a = 5;
		int b = 5;
		System.out.println("Escola Bieja-Flor Nota: " + (a+b));*/
	}
}

class Livros{
	private String nome;
	private Integer nm_pag;
}
