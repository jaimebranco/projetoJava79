package vetor;

public class ExemploVetor {

	public static void main(String[] args) {
		String vetorString[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi" };
		//Tipo nome_vetor [] = { valores }

		for (int indice = 0; indice < 5; indice++) {
			System.out.println((indice + 1) + "º elemento: " + vetorString[indice]);
		}
		// nome_vetor [ indice ]
		// rua [1] == "Joao" 
		
		//cachorro[0] = "Boxer"
		//cachorro[1] = "Pastor alemão"
	}

}
