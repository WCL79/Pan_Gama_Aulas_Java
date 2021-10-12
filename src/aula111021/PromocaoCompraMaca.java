package aula111021;

import java.util.Scanner;

/*
 * 4)	As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, 
 * e R$ 0,25 se forem compradas pelo menos doze.
 *Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra
 */
public class PromocaoCompraMaca {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        double qtdComprado;
        double precoNormal = 0.30d;
        double precoPromo = 0.25d;

        System.out.println("Quantas macas foram compradas?");
        qtdComprado = entrada.nextInt();
        
        if(qtdComprado < 12) {
        	qtdComprado *= precoNormal;
        	System.out.println("Total de maçãs:" +qtdComprado);
        }else {
        	qtdComprado *= precoPromo;
        	System.out.printf("Total a pagar %.2d",qtdComprado);
        }
        entrada.close();
    }
}