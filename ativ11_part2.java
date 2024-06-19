package curso19_06;

import java.util.Scanner;

public class ativ11_part2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int pares = 0;
		int i = 0;
		
		System.out.println("Digite 20 números:");
		while (i < 20) {
		System.out.print("Número " + (i + 1) + ": ");
		int numero = ler.nextInt();
		
		if (numero % 2 == 0) {
		pares++;
		}
		i++;
		}
		System.out.println("Quantidade de números pares: " + pares);
		
		ler.close();

	}

}
