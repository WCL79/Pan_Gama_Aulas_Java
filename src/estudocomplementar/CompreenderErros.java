package estudocomplementar;
/*
 * Tipos de ERROS:
 *  + SINTAXE
 *  + SEMÂNTICO
 *  + TEMPO DE EXECUÇÃO
 */

public class CompreenderErros {

	public static void main(String[] args) {
		
		int auxliar = 0;// Essa variável está inicializada com 0, caso não 
		//atribuisse valor a ela, haveria erro Semantico
		
		System.out.println("Olá Mundo!" + auxliar);//Caso a lingaguem perceba
		//Ausência ; "" para String algo para que o programa seja 	
		//Compilado, será Erro de Sintaxe

	}

}
