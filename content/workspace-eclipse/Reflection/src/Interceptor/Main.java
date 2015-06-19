/*
 * (Intercepta��o de m�todos) Crie uma annotation @Interceptor que possua como valor String um nome de m�todo (`met`) e um Class (`cl`) que representa uma classe.
 * Fa�a uma classe `Foo` com os m�todos privados `void fazAlgo()` que mostra na tela o nome do m�todo e `void fazNada()` que mostra a mensagem nada, apenas para teste. 
 * Fa�a uma classe `Bar` com um m�todo `void hello()` publico que mostra uma mensagem de boas-vindas. Este m�todo deve ser marcado com a annotation **@Interceptor** de modo a ter o nome do m�todo de sua escolha (*fazNada, fazAlgo*) e um `Foo.class`. 
 * Fa�a uma classe `Delegator` que possua o m�todo `void voidExecutor(Object, String)` que recebe um Object de referencia e um nome de m�todo. Se o m�todo n�o existir, exiba um erro. Se existir procure pela annotation **@Interceptor** e execute o m�todo definido nesta annotation. Ap�s a execu��o do m�todo definido na annotation. o m�todo em quest�o de dentro de voidExecutor deve ser chamado tambem.
 */
package Interceptor;

import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException {
		Delegator d = new Delegator();
		d.voidExecutor( new Bar(), "hello" );
	}

}
