package desafio1;

public class Caixa {

	public double calculaValorFinal (Produto p, int quantidade) {
		double valorFinal = 0;
		if (p.getTipo()== 1) {
			valorFinal = (p.getValor() * quantidade) * 0.10;			
		}
		else if (p.getTipo()== 2) {
			valorFinal = (p.getValor() * quantidade) * 0.20;
			}
		else if ((p.getTipo()== 3)&&(quantidade >5)) {
			valorFinal = (p.getValor() * quantidade) * 0.10;
		}
		else {
			valorFinal = (p.getValor() * quantidade * 0.10);			
		}
		return valorFinal;
		
	}
}
