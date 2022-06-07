import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		String Leitura; //variavel Leitura do tipo string
		Scanner scanner  = new Scanner(System.in); // instanciando e criando um objeto Scanner
		
		System.out.println("Digite uma frase"); //Syso para imprimir informaçoes na tela
		Leitura = scanner.nextLine(); //salvando na variável Leitura o que o usuário digitar
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))){			   
			escrever.write(Leitura); //usando BufferedWriter para escrever texto no arquivo de escrita(entrada.txt)
		}
	
		
		try(BufferedReader reader = new BufferedReader (new FileReader("entrada.txt"))){ //usando BufferedReader para ler texto do arquivo (entrada.txt)
		   String line;
		   String string = "";
		   
		   while((line = reader.readLine())!= null) {
			   string += line + "\n";
		   }
			System.out.println(string);
		  }

		}
	
}




	

