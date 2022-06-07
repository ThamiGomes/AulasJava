import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
	
		Scanner scanner  = new Scanner(System.in); // usando o scanner para receber informaçoes do usuario
		
		Matematica matematica = new Matematica(); // instanciando objeto
		
		//Syso para mostrar informaçoes na tela
		System.out.println("Somar dois números");
		System.out.println("Digite o primeiro número");
		int x = scanner.nextInt(); // o que o Usuario digitar ira ser salvo nessa variavel
		
		System.out.println("Digite o segundo número");
		int y = scanner.nextInt();
		
		int soma = matematica.somar(x, y);  //Variável que irá salvar a soma dos dois valores inteiros
		System.out.println("O resultado é" + soma + "!!!"); // mostrar na tela o resultado da soma
		
		soma = matematica.somar(x, y, 5); //Variável que irá salvar a soma de três valores inteiros
		System.out.println("O resultado é" + soma + "!!!"); // mostrar na tela o resultado da soma
		
		double soma2 = matematica.somar(x, y); //Variável que irá salvar a soma dos dois valores double
		System.out.println("O resultado é" + soma2 + "!!!"); // mostrar na tela o resultado da soma
				
	}

}
