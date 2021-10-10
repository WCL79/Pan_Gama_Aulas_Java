package aulaInteiro091021;

import java.util.Scanner;

public class TresNumerosInteiroMaiorMenor {

	public static void main(String[] args) {
		
		int num1, num2 = 0, num3 = 0;
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Informe o primeiro numero:");
		num1 =  entrada.nextInt();
		
		System.out.println("Informe o segundo numero:");
		num2 =  entrada.nextInt();
		
		System.out.println("Informe o terceiro numero:");
		num3 =  entrada.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O primeiro número é maior" + num1);
			}else if (num2 > num3) {
				System.out.println("O primeiro número é maior" + num2);
			}else {
				System.out.println("O terceiro número é o maior" + num3);
			}
		} 
	}
