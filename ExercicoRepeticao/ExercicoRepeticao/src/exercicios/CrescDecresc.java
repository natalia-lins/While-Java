package exercicios;

import java.util.Scanner;

public class CrescDecresc {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num, i, m;
		
		System.out.println("Digite um número para ver a ordem crescente e decrescente");
		num = ler.nextInt();
		
		System.out.println("Ordem crescente:");
		for(i=0; i<=num; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("Ordem decrescente:");
		for(m=num; m>=0; m--) {
			System.out.println(m);
		}

	}

}
