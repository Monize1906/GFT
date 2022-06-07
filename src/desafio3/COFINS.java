package desafio3;

public class COFINS implements Imposto {

	@Override
	public double calcularImposto(double valor) {
		double imposto = 0;
		if (valor <25000) 
			imposto = valor *0.05;
		else imposto = valor *0.1;
		
		return imposto;
	}

}
