/*
 * Em uma empresa p�blca, um cargo possui um nome e um valor de sal�rio. 
 * Os cargos de ingresso s�o auxiliar, especialista, e gerente. 
 * Se algu�m com um cargo entrar para um cargo pol�tico (Secret�rio, Prefeito ou Vereador) 
 * o sal�rio deve ser incorporado. Um cargo pode ter mais de uma incorpora��o, os s�larios
 * base s�o calculados como se segue:
 * - Auxiliar = Inicial + 1000
 * - Especialista = Inicial + 2500
 * - Gerente = Inicial + 3000
 * e as incorpora��es:
 * - Prefeito = Base + 4000
 * - Secret�rio = Base + 2000
 * - Vereador = Base + 5000
 * Para o cargo: Se algu�m entra como especialista e incorpora vereador e prefeito o cargo fica: 
 * especialista incorporado como prefeito incorporado como vereador.
 */
package empresapublicacargos;

public class Main {

	public static void main(String[] args) {

		Especialista flaviaEspecialista = new Especialista(800.0);		
			System.out.println( flaviaEspecialista.mostrarNome() + " R$ " + flaviaEspecialista.calcSalario() );
		
		Incorporados flaviaVereadora = new Vereador(1700.0);
		flaviaVereadora.setProx(flaviaEspecialista);	
			System.out.println( flaviaVereadora.mostrarNome() + " R$ " + flaviaVereadora.calcSalario() );
		
		Incorporados flaviaPrefeita = new Vereador(2300.0);
		flaviaPrefeita.setProx(flaviaVereadora);	
				System.out.println( flaviaPrefeita.mostrarNome() + " R$ " + flaviaPrefeita.calcSalario() );
		
		/* console
		   Especialista R$ 3300.0
		   Especialista incorporado como Vereador R$ 8300.0
		   Especialista incorporado como Vereador incorporado como Vereador R$ 13300.0
		 */
	}

}
