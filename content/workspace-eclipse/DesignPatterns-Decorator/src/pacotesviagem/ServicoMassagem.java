package pacotesviagem;

public class ServicoMassagem extends PacoteDecorator {
	public ServicoMassagem(Pacote pacote) {
		super(pacote, "Servi�o de Massagem", 50.0);
	}
}