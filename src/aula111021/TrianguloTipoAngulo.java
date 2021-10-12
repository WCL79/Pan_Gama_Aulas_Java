package aula111021;

import java.util.Scanner;

/*
 * 1)	Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo que:
− Triângulo Retângulo: possui um ângulo reto. (igual a 90o)
− Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90o)
− Triângulo Acutângulo: possui três ângulos agudos. (menor que 90o)
 */
public class TrianguloTipoAngulo {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

	        int angulo1 = 90, angulo2 = 90, angulo3 = 90;

	        System.out.println("Digite o angulo 1:");
	        angulo1 = entrada.nextInt();

	        System.out.println("Digite o angulo 2:");
	        angulo2 = entrada.nextInt();

	        System.out.println("Digite o angulo 3:");
	        angulo3 = entrada.nextInt();
	        
	        if(angulo1 == angulo2 && angulo2 == angulo3) {
	        	 System.out.println("retangulo");
	        }else if (angulo1 < angulo2 && angulo1 < angulo3) {
	        	System.out.println("acutângulo");
			}else if(angulo1 > angulo2 || angulo1 > angulo3 && angulo2 > angulo3) {
				System.out.println("obtusângulo");
	        entrada.close();
	    }
	}
}

