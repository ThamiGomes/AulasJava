
public class Pessoa {
     String nome;
     int numfigurinhas;
    
     
     void receber(int numfigurinhas) {
    	 this.numfigurinhas += numfigurinhas;
    	 
     }
     boolean dar(int numfigurinhas, Pessoa pessoa) {
    	//boolean msg:
    	 
    	 this.numfigurinhas -= numfigurinhas;
    	 
    	 if(this.numfigurinhas < numfigurinhas) {
    	 System.out.println("O n�mero de figurinhas que voce tem � menor que a quantidade que voce quer dar");
    	// msg = false;
    	 return false;
    	 
    	 }else{
    		 this.numfigurinhas -= numfigurinhas;
    		 pessoa.receber(numfigurinhas);
    		// msg = true;
    		 return true;
    		 
    	 }
    	 
    	 
    //	return msg;
    	 
    	 
    	 
    	 
    	
    	 
     }
}
     
