package desafio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Digite um valor");
		double num = readDouble();
		System.out.println();
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