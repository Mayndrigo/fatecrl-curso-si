package zoologico;

public class VisitorZooB extends VisitorZoo{
	
	public void visitante(Gato g){
		System.out.println("� um gato no ZooB");
	}
	
	public void visitante(Cachorro c){
		System.out.println("� um cachorro no ZooB");
	}
	//sobrecarga tempo de copila��o
	//sobrescrita tempo de execu��o
}
