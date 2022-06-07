package desafio3;

public class ICMS implements Imposto {

	@Override
	public double calcularImposto(double valor) {
		
		return 0.3*valor;
	}

}
