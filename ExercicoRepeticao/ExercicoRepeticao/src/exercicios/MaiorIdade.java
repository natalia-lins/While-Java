package exercicios;

import java.util.Scanner;

public class MaiorIdade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i, idade, maior=0;
		
		for (i=0; i<20; i++) {
			idade = ler.nextInt();
			if (idade>=18) {
				maior++;
			}
			
		}
		System.out.println(maior + " maior(es) de idade");
	}

}
