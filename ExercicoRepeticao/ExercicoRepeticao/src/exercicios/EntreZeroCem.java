package exercicios;

import java.util.Scanner;

public class EntreZeroCem {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num, i, cont=0;
		
		for(i=0; i<20; i++) {
			num = ler.nextInt();
			
			if(num>=0 && num<=100) {
				cont++;
			}
		}
		System.out.println(cont + " número(s) entre 0 e 100.");
	}

}