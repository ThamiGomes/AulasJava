
public class Pessoa {
     
     //atributos da classe
     String nome;
     int numfigurinhas;
    
     //método "receber" que tem o número de figurinhas como parâmetro
     void receber(int numfigurinhas) {
    	 this.numfigurinhas += numfigurinhas; //somando o número de figurinhas ao saldo inicial
    	 
     }
     //método "dar" que tem o número de figurinhas e a pessoa como parâmetro
     boolean dar(int numfigurinhas, Pessoa pessoa) {
    	//boolean retorno:
    	 
    	 this.numfigurinhas -= numfigurinhas;
    	 
    	 if(this.numfigurinhas < numfigurinhas) { //teste lógico para ver se tem figurinhas sufucientes para dar
    	 System.out.println("O número de figurinhas que voce tem é menor que a quantidade que voce quer dar"); //syso para imprimir informaçoes na tela
    	// retorno = false;
    	 return false; // retorno booleano
    	 
    	 }else{
    		 this.numfigurinhas -= numfigurinhas; //subtraindo a quantidade de figurinhas dadas do saldo inicial
    		 pessoa.receber(numfigurinhas); // outra pessoa recebe a quantidade de figurinhas dadas
    		// retorno = true;
    		 return true; // retorno booleano
    		 
    	 }
    	 
    	 
    //	return retorno;
    	 
    	 
    	 
    	 
    	
    	 
     }
}
     
