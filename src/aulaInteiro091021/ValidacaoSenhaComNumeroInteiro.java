package aulaInteiro091021;

import java.util.Scanner;

public class ValidacaoSenhaComNumeroInteiro {

	public static void main(String[] args) {

		int senha = 1234;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a senha");
		
		int senha1 = entrada.nextInt();
		 
		if (senha == senha1) {
			System.out.println("Acesso permitido");
		}else {
			System.out.println("Acesso Negado, senha incorreta");
		}
		 entrada.close();
	}
}
