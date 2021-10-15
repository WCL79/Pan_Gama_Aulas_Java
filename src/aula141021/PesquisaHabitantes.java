package aula141021;

import java.util.Scanner;

public class PesquisaHabitantes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double todosSalarios = 0.0, salarioAtual = 0.0, maiorSalario = 0;
		int filhos = 0, salarioMenosQueCem = 0;
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Informe o salario: ");
			salarioAtual = teclado.nextDouble();
			todosSalarios += salarioAtual;
			
			if (salarioAtual >= maiorSalario) {
				maiorSalario = salarioAtual;
			}
			System.out.println("Informe a quantidade de filhos: ");
			filhos += teclado.nextInt();
			
			if (salarioAtual <= 100) {
				salarioMenosQueCem++;
			}
		}
		double percentage = (salarioMenosQueCem * 100 / 20);
		System.out.println("Media de Salarios: " + todosSalarios / 20);
		System.out.println("Media de Filhos: " + filhos / 20);
		System.out.println("Maior salario: " + maiorSalario);
		System.out.println("Percentual com salario até 100: " + percentage + " %");
		teclado.close();
	}
}


