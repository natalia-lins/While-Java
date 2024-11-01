package exercicios;

import java.util.Scanner;

public class EntreZeroCemDuzentos {

		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			
			int num, i, cem=0, duz=0, trez=0;
			
			for(i=0; i<20; i++) {
				num = ler.nextInt();
				
				if( num<=100) {
					cem++;
				}
				else if(num<=200){
					duz++;
				}
				else {
					trez++;
				}
			}
			System.out.println(cem + " número(s) entre 0 e 100.");
			System.out.println(duz + " número(s) entre 101 e 200.");
			System.out.println(trez + " número(s) maior(es) que 200.");
		}

}

