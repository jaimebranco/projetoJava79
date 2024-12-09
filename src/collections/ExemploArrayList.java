package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {

		// Cria a Collection ArrayList, do tipo Double, chamada notas
		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner leia = new Scanner(System.in);

		// Cria um Objeto da Classe Wrapper Double
		Double y = Double.valueOf(9);

		// System.out.println("\nDigite um valor:");
		Double valor = leia.nextDouble();

		// double x = 8.7; não aceita numero primitivo

		/**
		 * Adiciona algumas Notas. Observe que a primeira nota é o Objeto Wrapper
		 * Double.
		 */
		// notas.add(valor);
		notas.add(y);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);

		/**
		 * Mostra na tela todas as notas adicionadas. Observe que a nota duplicada foi
		 * adicionada duas vezes.
		 */
		System.out.println("\nNotas cadastradas: " + notas);

		/*
		
		 */

		System.out.println("\notas cadastradas - laço for ... each");

		for (Double nota : notas) {
			System.out.println(nota);

		}
	}

}
