package exercicios;

import java.util.Scanner;

public class SomaPositivos {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double num, soma=0;
		
		System.out.printf("Bem vindo a soma de positivos! \nA soma para assim que você digitar um número menor que 0.\n");
		
		do {
			System.out.print("Digite um número: ");
			num = ler.nextDouble();
			if(num>0){
			soma = soma + num;
			}
		} while (num>0);
		
		System.out.println("A soma dos números digitados é " + soma);
	}

}
