package linguagemToy;

public class Main {

	public static void main(String[] args) {

		Toy comandos = new TocarSom( new TocarSom( new Escreve(null,"Escrevi essa frase: Ser ou n�o ser!") ) );
		Toy fim = new Nop();		

		/*
		 * console: 
		 * Escrevi essa frase: Ser ou n�o ser!
		 * Tocando som...
		 * Tocando som...
		 * Programa encerrado...
		 */
	}

}
