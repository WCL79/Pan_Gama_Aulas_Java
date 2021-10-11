package aula091021;

public class ContaBancariaBancoPan {
	
	private String nome;
    private int conta ;
    private double saldo, saques;
    
    public ContaBancariaBancoPan(String nome, int conta, double saldoInicial){
        this.nome=nome;
        this.conta=conta;
        saldo=saldoInicial;
        saques=0;
    }
    
    public void iniciar(){
        int opcao;
        do{
            exibirMenu();
            opcao = EntradaSaidaDados.numDigitadoUsuario().nextInt();
            escolherOpcao(opcao);
        }while(opcao!=4);
    }
    
 public void exibirMenu(){
	 
        EntradaSaidaDados.exibirDados("\t Escolha a opção desejada");
        EntradaSaidaDados.exibirDados("1 - Consultar Extrato");
        EntradaSaidaDados.exibirDados("2 - Sacar");
        EntradaSaidaDados.exibirDados("3 - Depositar");
        EntradaSaidaDados.exibirDados("4 - Sair\n");
        EntradaSaidaDados.exibirDados("Opção: ");
        
    }
    
    public void consultarExtrato(){
    	EntradaSaidaDados.exibirDados("\tEXTRATO");
    	EntradaSaidaDados.exibirDados("Nome: " + this.nome);
    	EntradaSaidaDados.exibirDados("Número da conta: " + this.conta);
    	EntradaSaidaDados.exibirDados("Saldo atual: %.2f\n");
    	EntradaSaidaDados.exibirDados("Saques realizados hoje: " + this.saques + "\n");
    }
    
    public void realizarDeposito(double valor)
    {
        saldo += valor;
        EntradaSaidaDados.exibirDados("Depositado: " + valor);
        EntradaSaidaDados.exibirDados("Novo saldo: " + saldo + "\n");
    }
    
    public void realizarSaque(double valor){
        if(saldo >= valor){
            saldo -= valor;
            saques++;
            EntradaSaidaDados.exibirDados("Sacado: " + valor);
            EntradaSaidaDados.exibirDados("Novo saldo: " + saldo + "\n");
        } else {
        	EntradaSaidaDados.exibirDados("Saldo insuficiente. Faça um depósito\n");
        }
    }
    
    public void escolherOpcao(int opcao){
        double valor;
        switch( opcao ){
            case 1:    
            	consultarExtrato();
                    break;
            case 2: 
                    if(saques<3){
                    	EntradaSaidaDados.perguntarAoUsuario("Quanto deseja sacar: ");
                        valor = EntradaSaidaDados.numDigitadoUsuario().nextDouble();
                        realizarSaque(valor);
                    } else{
                    	EntradaSaidaDados.exibirDados("Limite de saques diários atingidos.\n");
                    }
                    break;
                    
            case 3:
            		EntradaSaidaDados.perguntarAoUsuario("Quanto deseja depositar: ");
                    valor = EntradaSaidaDados.numDigitadoUsuario().nextDouble();
                    realizarDeposito(valor);
                    break;
                    
            case 4: 
            		EntradaSaidaDados.exibirDados("Sistema encerrado.");
                    break;
                    
            default:
            	EntradaSaidaDados.exibirDados("Opção inválida");
        }
    }
}

