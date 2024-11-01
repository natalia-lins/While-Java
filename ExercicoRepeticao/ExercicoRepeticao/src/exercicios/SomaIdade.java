package exercicios;

import java.util.Scanner;

public class SomaIdade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i, idade, soma=0;
		
		for (i=0; i<20; i++) {
			idade = ler.nextInt();
			soma = soma + idade;
		}
		System.out.println("Soma das idades: "+ soma);
	}

}
