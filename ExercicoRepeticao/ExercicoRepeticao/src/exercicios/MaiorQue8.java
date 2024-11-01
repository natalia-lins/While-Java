package exercicios;

import java.util.Scanner;

public class MaiorQue8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num, i, cont=0;
		
		for(i=0; i<20; i++) {
			num = ler.nextInt();
			
			if(num>8) {
				cont++;
			}
		}
		System.out.println(cont + " número(s) maior(es) que 8.");
	}

}
