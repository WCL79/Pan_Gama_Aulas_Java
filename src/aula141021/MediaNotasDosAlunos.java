package aula141021;

import java.util.Scanner;

import aula091021ContaBancaria.EntradaSaidaDados;

/*
 * Calcular média de X alunos.
* Notas válidas: entre 0 e 10
* Contar quantas notas válidas foram digitadas
* Usuário deve digitar -1 para sair do programa 
* e ser informado da sua média e quantidade de notas
 */

public class MediaNotasDosAlunos {
	
	public static void main(String[] args){

	Scanner entrada = new Scanner(System.in);
	int quantidadeNotas = 0;
	double nota, total = 0.0;
	
	while(true) {
		System.out.println("Digite a proxima nota: ( ou digitar -1 para finalizar)");
		nota = entrada.nextDouble();
		
			if(nota >= 0 && nota <= 10) {
				quantidadeNotas++;
				total += nota;
			}else if(nota == -1) {
				
				double media = total / quantidadeNotas;
				System.out.println("Quantidades de notas totais: " + quantidadeNotas);
				System.out.printf("Média = %.2f %n",  media);
				
				break;
				
			} else {
				System.out.println("Nota invalida");
			}					
		}		
		entrada.close();
	}
}
