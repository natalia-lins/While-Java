package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num, i;
		String decisao;
		
		System.out.println("Seja bem vindo! Deseja saber a tabuada de algum número? (Sim/Não)");
		decisao = ler.next();
		
		if(decisao.equalsIgnoreCase("sim")) {
			System.out.print("Digite um número inteiro: ");
			num = ler.nextInt();
			for(i=1; i<=10; i++) {
				System.out.println(i + "x" + num + " = " + i*num);
			}
		}
		else {
			System.out.print("Adeus! Obrigada pelo acesso. :)");
		}

	}

}
