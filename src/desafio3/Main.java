package desafio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Digite um valor");
		ICMS icms = new ICMS();
		COFINS cofins = new COFINS();
		IPI ipi = new IPI();
		double num = readDouble();
		double soma =  icms.calcularImposto(num) + cofins.calcularImposto(num) + ipi.calcularImposto(num);
		System.out.println("ICMS:" + icms.calcularImposto(num));
		System.out.println("IPI:" + cofins.calcularImposto(num));
		System.out.println("COFINS:" + ipi.calcularImposto(num));
		System.out.println("Valor FINAL:" +soma);
	}


	public static String readString() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		} catch (IOException e) {
			throw new RuntimeException("Erro ao ler o dado do teclado");
		}
	}
	public static double readDouble() {
		String str = readString();
		
		try {
			return Double.parseDouble(str);
		} catch(NumberFormatException e) {
			throw new RuntimeException(str + " nao é um int válido");
		}
	}

}