package zoologico;

final public class Gato extends Animal{ //se a classe � abstrata eu n�o tenho que implementar o metodo

	public Gato(String nome) {
		super(nome);
	}

	@Override
	public void emitirSom() {
		System.out.println("MIAU MIAU");
	}

	public void accept(VisitorZoo z) {
		z.visitante(this);
	}	
	//@override ela � opcional //indica pro copilador se estou faazendo a sobrescrita certa
}
