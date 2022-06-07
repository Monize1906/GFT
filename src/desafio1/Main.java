package desafio1;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto ("Banana", 0.99,2);
		Produto p2 = new Produto ("Energético", 5.49,3);
		Produto p3 = new Produto ("Arroz", 20.0,1);
		Produto p4 = new Produto ("Chocolate", 4.50,1);
		Produto p5 = new Produto ("Leite", 3.73,3);
		Produto p6 = new Produto ("Abacaxi", 2.40,2);
		
		Caixa cx = new Caixa();
		
		String result = "";
		result += p1.getNome() + " | ";
		result += p1.getValor() + " | ";
		result += p1.getTipo() + " | ";
		result += cx.calculaValorFinal (p1, 3);
		System.out.println(result);
		
		result = "";
		result += p2.getNome() + " | ";
		result += p2.getValor() + " | ";
		result += p2.getTipo() + " | ";
		result += cx.calculaValorFinal (p2, 7);
		System.out.println(result);
		
		result = "";
		result += p3.getNome() + " | ";
		result += p3.getValor() + " | ";
		result += p3.getTipo() + " | ";
		result += cx.calculaValorFinal (p3, 1);
		System.out.println(result);
		
		result = "";
		result += p4.getNome() + " | ";
		result += p4.getValor() + " | ";
		result += p4.getTipo() + " | ";
		result += cx.calculaValorFinal (p4, 12);
		System.out.println(result);
		
		result = "";
		result += p5.getNome() + " | ";
		result += p5.getValor() + " | ";
		result += p5.getTipo() + " | ";
		result += cx.calculaValorFinal (p5, 5);
		System.out.println(result);
		
		result = "";
		result += p6.getNome() + " | ";
		result += p6.getValor() + " | ";
		result += p6.getTipo() + " | ";
		result += cx.calculaValorFinal (p6, 1);
		System.out.println(result);

	}

}
