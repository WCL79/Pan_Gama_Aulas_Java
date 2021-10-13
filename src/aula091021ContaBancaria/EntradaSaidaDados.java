package aula091021ContaBancaria;

import java.util.Random;
import java.util.Scanner;

public class EntradaSaidaDados {
	
	public static Random random(){
        return new Random();
    }
 
    public static Scanner criarScanner(){
        return new Scanner(System.in);
    }
    public static Scanner numDigitadoUsuario(){
        return new Scanner(System.in);
    }
    public static void exibirDados(String texto){
        System.out.println(texto);
    }
    public static void perguntarAoUsuario(String texto){
        System.out.println(texto);
    }
}
