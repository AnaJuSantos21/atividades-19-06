package curso19_06;

import java.util.Scanner;

public class ativ10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero = 0, contador = 0;
		
		for (int i = 0; i < 20; i++) {
		System.out.print("Digite o número " + (i + 1) + ": ");
		numero = ler.nextInt();
		
		if (numero>= 8){
		contador ++;
		}
		System.out.println("Quantidade de números maiores que 8: " + contador);
		}
		ler.close();
		}
		

	}


