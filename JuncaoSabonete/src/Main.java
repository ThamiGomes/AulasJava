import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Sabonete sabonete1 = new Sabonete("cheiro", "Cor"); // instanciando um objeto sabonete com  parâmetros
		Sabonete sabonete2 = new Sabonete("cheiro", "Cor"); // instanciando um objeto sabonete com  parâmetros
		Sabonete sabonete3 = new Sabonete("cheiro", "Cor"); // instanciando um objeto sabonete com  parâmetros

		List<Sabonete> listaDeSabonetes = new ArrayList<Sabonete>(); // criando uma lista da classe sabonete

		listaDeSabonetes.add(sabonete1); //adicionando as informações do sabonete na lista
		listaDeSabonetes.add(sabonete2); //adicionando as informações do sabonete na lista
		listaDeSabonetes.add(sabonete3); //adicionando as informações do sabonete na lista

		// usar try se der algum erro, ele indicara o erro
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Sabonete.txt"))) {  //criando um objeto de escrita
			//bufferedWrite é uma memória temporária usada para escrever,
			//sabonete.txt é o local onde irá aparecer as palavras que forem escritas
			for (Sabonete sabonete : listaDeSabonetes) //para a lista de sabonetes, irá escrever as palavras no txt
				escrever.write(sabonete.toString()+"\n");
			
		}
		
		List<Sabonete> listaDeSabonetesLidos = new ArrayList<Sabonete>(); // criando listaDeSabonetesLidos da classe <Sabonete>

		try (BufferedReader reader = new BufferedReader(new FileReader("Sabonete.txt"))) {  //BufferedReader é usado para ler o que estiver escrito no Sabonete txt
			String line;

			while ((line = reader.readLine()) != null) { //lendo a linha se não for diferente de null 
				 //reader line = lendo linha 
					// != diferente
				
				Sabonete sabonetes = new Sabonete(line); // criando um objeto que recebeu a string Line que leu toda a escrita
				listaDeSabonetesLidos.add(sabonetes); //adicionando a nova variável que teve a escrita lida na listaDeSabonetesLidos
				// string += line + "\n";

			}
		}

		for (Sabonete SabonetesLidos : listaDeSabonetesLidos)
			System.out.println(SabonetesLidos.toString());
	
		
		//para a listaDeSabonetesLidos , irá mostrar a escrita na tela
		
	//	String teste = "Sabonete: cheiro=Azevedo, cor=Verde";

	//	Sabonete sabonete2 = new Sabonete(teste);
	//	System.out.println(sabonete2);
	}

}
