package zoologico;

public class VisitorZoo {

	public void visitante(Gato g) {
		System.out.println("� um gato");
	}

	public void visitante(Cachorro c) {
		System.out.println("� um cachorro");
	}
	// sobrecarga tempo de copila��o
	// sobrescrita tempo de execu��o
}
