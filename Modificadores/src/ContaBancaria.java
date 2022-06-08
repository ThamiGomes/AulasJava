
public class ContaBancaria {
	
	//atributos privados da classe
	private int numConta;
	private boolean ativo;
	private double saldo;
	
	
	public ContaBancaria () {
		ativo = true;
		saldo = 1.0;
				
	}
	//construtor que define os parâmetros
	public ContaBancaria(boolean ativo, double saldo) {
		
		this.ativo = ativo;
		this.saldo = saldo;
	}

	public void receber(double valor) { // nesse método não retorna nenhuma informação
		saldo += valor; //O valor será somado ao saldo
		
	}

	public double saldo() {
		return saldo;
		
	}
	public void dar(double valor) { 
		if(saldo >= valor) //condição lógica que só irá permitir funcionar se tiver saldo suficiente
		  saldo -= valor; //O valor será subtraído do saldo
		
	}

	{
		
	}
}
