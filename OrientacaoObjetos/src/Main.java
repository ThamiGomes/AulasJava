
public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoal = new Pessoa(); //Criando a variavel e instanciando o Objeto Pessoa
		
		pessoal.nome = "Thamires";
		pessoal.numfigurinhas = 1;
		
		pessoal.receber(3);
		
		System.out.println(pessoal.nome);
		System.out.println(pessoal.numfigurinhas);
			

	}

}
