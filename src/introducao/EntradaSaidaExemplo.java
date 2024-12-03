package introducao;

import java.util.Scanner;

public class EntradaSaidaExemplo {

	public static void main(String[] args) {
		// variaveis
		String nome;
		float temperatura;
		float fahrenheit;

		try (Scanner leia = new Scanner(System.in)) {
			// Entrada de dados - Pedir/Inserir o nome, temperatura
			System.out.println("Insira o seu nome: ");
			nome = leia.next();

			System.out.println("Insira a tempreatura em Celsius: ");
			temperatura = leia.nextFloat();
		}

		// processamento
		fahrenheit = temperatura * 1.8f + 32;

		// saída dos dados
		System.out.println("Bom dia,  " + nome);
		System.out.printf("A temperatura em Fahrenheit é: %.1f." , fahrenheit); // Concatenação
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

	}

}
