package aula091021;

public class BancoPan {

	 public static void main(String[] args){
	       
		 	String nomeCliente;
	        double inicial;
	        int numero = EntradaSaidaDados.random().nextInt(9999);
	        int conta = 1 + numero;
	    
	        EntradaSaidaDados.perguntarAoUsuario("Cadastrando novo cliente.\n");
	        EntradaSaidaDados.perguntarAoUsuario("Ente com seu nome:\n ");
	        nomeCliente = EntradaSaidaDados.criarScanner().next();
	        
	        EntradaSaidaDados.perguntarAoUsuario("Deposite um valor para iniciar sua conta: \n");
	        inicial = EntradaSaidaDados.numDigitadoUsuario().nextDouble();
	        
	        ContaBancariaBancoPan criarContaCliente = new ContaBancariaBancoPan(nomeCliente, conta, inicial);
	        criarContaCliente.iniciar();
	    }
	    
	}
