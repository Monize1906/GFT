package desafio2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculos {

	public static void main(String[] args) {
		Integer[] lista = new Integer[10]; 
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero ["+i+"]:");
			lista[i] = readInt();
		}
		sort(lista);
		
		System.out.println("Maior numero: " + lista[0]);
		System.out.println("Menor numero: " + lista[9]);
		Integer soma = 0;
		for (Integer num:lista) {
			soma+=num;
		}
		System.out.println("Media dos numeros: " + soma/10);
		String acimaDeDez ="";
		for (Integer num:lista) {
			if (num > 10) acimaDeDez+=num + " ";
		}
		System.out.println("Numeros acima de 10: " + acimaDeDez);
		String acimaDeCinquenta ="";
		for (Integer num:lista) {
			if (num > 50) acimaDeCinquenta+=num + " ";
		}
		System.out.println("Numeros acima de 50: " + acimaDeCinquenta);
	}
	
	public static void sort(Integer[] lista) {
		for (int i=0; i<lista.length-1;i++) {
			for(int j=(i+1);j<lista.length;j++) {
				if (lista[i]<lista[j]) {
					Integer aux = lista[i];
					lista[i]=lista[j];
					lista[j]=aux;
				}
			}
		}
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
