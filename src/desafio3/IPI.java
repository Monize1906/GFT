package desafio3;

public class IPI implements Imposto {

	@Override
	public double calcularImposto(double valor) {
	
		return (valor>=17000)? valor*0.08 :0;
	}

}
