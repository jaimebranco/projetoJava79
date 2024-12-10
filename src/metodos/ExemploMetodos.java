package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {

		int resultado = somar(2, 5);
		System.out.println("O primeiro resultado é " + resultado);

		System.out.println("O segundo resultado é " + somar(8, 3));
		
		falar("pode ser,bom dia");
		falar("O gato amarelo");
		
		ExemploMetodoExterno.mensagem();
	}
	// defunição de método somar - Método com retorno e com parametro

	public static int somar(int x, int y) {
		return x + y;
	}
	// defunição de método somar - Método sem retorno e com parametro
	public static void falar(String mensagem) {
		System.out.println(mensagem);
	}

}

//definicao estou criando
// executando é chamando