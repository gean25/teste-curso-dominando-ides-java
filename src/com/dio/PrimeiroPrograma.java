package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
		
		/*int a = 5;
		int b = 5;
		System.out.println("Escola Bieja-Flor Nota: " + (a+b));*/
	}
}

class Livro{
	private String nome;
	private Integer nm_pag;
}
