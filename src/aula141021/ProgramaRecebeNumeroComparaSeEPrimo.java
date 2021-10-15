package aula141021;

import java.util.Scanner;

public class ProgramaRecebeNumeroComparaSeEPrimo {

	public static void main(String[] args) {
	
		Scanner num = new Scanner(System.in);
		
		int  numPrimmo, numDivisor = 0;
	
	    	 System.out.printf("Esse programa calcula se o número informado é PRIMO\n");
	         System.out.printf("Informe um número:");
	         numPrimmo = num.nextInt();

	         for(int i=1; i<= numPrimmo; i++) {
	             if(numPrimmo % i == 0) {
	            	 numDivisor ++;
	             }
	             if(numDivisor == 2) {
	            	 System.out.printf("é primo");
	             }else {
	            	 System.out.printf("não é primo");
	             }
	         }
	}
}