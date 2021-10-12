package aula111021;

import java.util.Scanner;

/*
 3)	Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno. Sendo que:
*− Triângulo Equilátero: possui os 3 lados iguais.
*− Triângulo Isóscele: possui 2 lados iguais.
*− Triângulo Escaleno: possui 3 lados diferentes.
 */

public class TrianguloTipoDeAngulo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int ladoA, ladoB, ladoC;

		System.out.print("Verificador de Triângulo\n\n");

		System.out.print("Digite o lado A:");
		ladoA = entrada.nextInt();

		System.out.print("Digite o lado B:");
		ladoB = entrada.nextInt();

		System.out.print("Digite o lado C:");
		ladoC = entrada.nextInt();

		if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) { // Verificar se cada lado é menor
																																	// que a soma dos outros dois
																																	// lados.

			if (ladoA == ladoB && ladoB == ladoC) { // saber de A==B e se B==C, sendo verdade o triângulo é eqüilátero
				System.out.print("O triângulo é Eqüilátero.");
			} else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) { // Se não, verificar de A==B ou se A==C ou 	
																										// se B==C, sendo verdade o triângulo é // isósceles
				System.out.print("O triângulo é Isósceles.");
			} else { // e caso contrário, o triângulo será escaleno
				System.out.print("O triângulo é Escaleno.");
			}
		} else {
			System.out.print("Os lados fornecidos não caracterizam um triângulo");
		}
		entrada.close();
	}

}