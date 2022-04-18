
public class Pessoa {
     String nome;
     int numfigurinhas;
    
     
     void receber(int numfigurinhas) {
    	 this.numfigurinhas += numfigurinhas;
    	 
     }
     boolean dar(int numfigurinhas, Pessoa pessoa) {
    	//boolean retorno:
    	 
    	 this.numfigurinhas -= numfigurinhas;
    	 
    	 if(this.numfigurinhas < numfigurinhas) {
    	 System.out.println("O número de figurinhas que voce tem é menor que a quantidade que voce quer dar");
    	// retorno = false;
    	 return false;
    	 
    	 }else{
    		 this.numfigurinhas -= numfigurinhas;
    		 pessoa.receber(numfigurinhas);
    		// retorno = true;
    		 return true;
    		 
    	 }
    	 
    	 
    //	return retorno;
    	 
    	 
    	 
    	 
    	
    	 
     }
}
     
