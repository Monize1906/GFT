package desafio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class JogoSorte {

	public static void main(String[] args) {
		int num = -1;
        Random random = new Random();
        int aleatorio = random.nextInt(10);

        do {
        	System.out.println("Digite Numero inteiro aleatorio de 0 ate 10:");
        	num = readInt();
        	if (num == aleatorio )System.out.println("Parabens!");
        }while(aleatorio != num);
        
	}
	public static String readString() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		} catch (IOException e) {
			throw new RuntimeException("Erro ao ler o dado do teclado");
		}
	}
	public static int readInt() {
		String str = readString();
		
		try {
			return Integer.parseInt(str);
		} catch(NumberFormatException e) {
			throw new RuntimeException(str + " nao é um int válido");
		}
	}
}
