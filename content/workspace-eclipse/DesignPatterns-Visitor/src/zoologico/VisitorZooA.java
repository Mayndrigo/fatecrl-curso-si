package zoologico;

public class VisitorZooA extends VisitorZoo {

	public void visitante(Gato g) {
		System.out.println("� um gato no ZooA");
	}

	public void visitante(Cachorro c) {
		System.out.println("� um cachorro no ZooA");
	}
	// sobrecarga tempo de copila��o
	// sobrescrita tempo de execu��o
}
