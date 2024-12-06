package vetor;

import java.util.Scanner;

public class ExemploVetorUsuario {

	public static void main(String[] args) {
		
		// tipo nome_vetor = new tipo [quantidade_valore]
		int numeros [] = new int [5]; // 0-1-2-3-4
		// 0 [] 1[] 2[]
		
		// String nome;
		
        Scanner leia = new Scanner(System.in);
        
        for(int indice = 0; indice < 5; indice ++) {
            System.out.println("Digite o " + (indice + 1)  +"º Número: ");
            numeros[indice] = leia.nextInt(); // ler algo e adicionat ao vetor
            
            // nome = leia.next();
            
        }
        
        System.out.println("\nOs números digitados foram: \n");
        
        }
		

	}


