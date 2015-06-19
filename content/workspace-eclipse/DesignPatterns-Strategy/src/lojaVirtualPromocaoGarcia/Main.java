/*
 * Uma loja virtual prossue alguns produtos a venda. Os produtos s�o livros, DVDs e brinquedos. 
 * Cada produto possui nome e pre�o. A mesma loja oferece promo��es diferentes a cada m�s. 
 * Uma promo��o regu�ar desconta cada produto em 10% mais um desconto extra varia de 5% a 10% dependendo do m�s. 
 * Uma liquida��o desnconta 30% ao pre�o de cada produto. H� meses quen�o h� promo��o descrita.
 * Esta situa��o: 
 * - A) Desenhe o diagrama de classes;
 * - B) Codifique com base em A).
 */
package lojaVirtualPromocaoGarcia;

public class Main {

	public static void main(String[] args) {
		Brinquedo brinquedoCarro = new Brinquedo("Carro HotWells", 100);
		brinquedoCarro.setPromocao( new Regular(0.95) );
		System.out.println( "BRINQUEDO (regular): " + brinquedoCarro.calcularPreco() );
		// console: BRINQUEDO (regular): 90.0
		
		Livro livroHP = new Livro("Box Harry Potter", 500);
		livroHP.setPromocao( new Liquidacao() );
		System.out.println( "LIVRO (liquidacao): " + livroHP.calcularPreco());
		// console: LIVRO (liquidacao): 350.0
	}

}
