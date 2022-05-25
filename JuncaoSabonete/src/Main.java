import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		

		List<Sabonete> listaDeSabonetes = new ArrayList<Sabonete>();
		
	try(BufferedReader reader = new BufferedReader (new FileReader("entrada.txt"))){
	   String line;
	   String string = "";
	   
	   while((line = reader.readLine())!= null) {
			Sabonete sabonete = new Sabonete(line);
		   //string += line + "\n";

			
	   }
		System.out.println(string);
	  }
//  Sabonete sabonete1 = new Sabonete ("Azedo", "Verde");
//  string s = sabonete1.toString();
	
	String teste = "Sabonete: cheiro=Azevedo, cor=Verde";
	
	Sabonete sabonete2 = new Sabonete(teste);
	System.out.println(sabonete2);
	}

}
