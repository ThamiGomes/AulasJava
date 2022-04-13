
public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa(); //Criando a variavel e instanciando o Objeto Pessoa
		
		pessoa1.nome = "Thamires";
		pessoa1.numfigurinhas = 1;
		
		pessoa1.receber(3);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numfigurinhas);
		
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.nome = "Thais";
		pessoa2.numfigurinhas = 5;
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numfigurinhas);
			
		boolean msg = pessoa1.dar(1, pessoa2);
		
		if(msg==true)
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numfigurinhas);
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numfigurinhas);
			
		
		

	}

}
