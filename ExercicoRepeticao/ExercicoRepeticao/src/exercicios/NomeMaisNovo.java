package exercicios;

import java.util.Scanner;

public class NomeMaisNovo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i, idade, menor=1000;
		String nome, novo = null;
		
		for (i=0; i<10; i++) {
			System.out.print("Digite o nome: ");
			nome = ler.next();
			System.out.print("Digite a idade: ");
			idade = ler.nextInt();
			if(idade<menor) {
				menor = idade;
				novo = nome;
			}
		}
		System.out.println("A pessoa mais nova é " + novo + " com " + menor + " anos.");
		}
		
	}


