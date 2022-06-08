
public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa(); //Criando a variavel e instanciando o Objeto Pessoa
		
		pessoa1.nome = "Thamires"; //atribuindo o nome do objeto
		pessoa1.numfigurinhas = 1; //atribuindo o número de figurinhas 
		
		pessoa1.receber(3); // O objeto irá receber 3 figurinhas que são somadas no saldo inicial
		
		//Syso ara mostrar o número de figurinhas
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numfigurinhas);
		
		Pessoa pessoa2 = new Pessoa(); //criando a variável e instanciando o objeto pessoa2
		
		pessoa2.nome = "Thais"; //atribuindo o nome do objeto
		pessoa2.numfigurinhas = 5;  //atribuindo o número de figurinhas
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numfigurinhas);
			
		boolean retorno = pessoa1.dar(1, pessoa2); //variável booleana que recebe o método dar e os parâmetros
		
		if(retorno==true) //teste lógico para saber se tem numeros suficientes de figurinhas
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numfigurinhas);
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numfigurinhas);
			
		
		

	}

}
