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

		Sabonete sabonete1 = new Sabonete("cheiro", "Cor");
		Sabonete sabonete2 = new Sabonete("cheiro", "Cor");
		Sabonete sabonete3 = new Sabonete("cheiro", "Cor");

		List<Sabonete> listaDeSabonetes = new ArrayList<Sabonete>();

		listaDeSabonetes.add(sabonete1);
		listaDeSabonetes.add(sabonete2);
		listaDeSabonetes.add(sabonete3);

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Sabonete.txt"))) {
			for (Sabonete sabonete : listaDeSabonetes)
				escrever.write(sabonete.toString()+"\n");
		}
		
		List<Sabonete> listaDeSabonetesLidos = new ArrayList<Sabonete>();

		try (BufferedReader reader = new BufferedReader(new FileReader("Sabonete.txt"))) {
			String line;

			while ((line = reader.readLine()) != null) {
				
				Sabonete sabonetes = new Sabonete(line);
				listaDeSabonetesLidos.add(sabonetes);
				// string += line + "\n";

			}
		}

		for (Sabonete SabonetesLidos : listaDeSabonetesLidos)
			System.out.println(SabonetesLidos.toString());
	
	//	String teste = "Sabonete: cheiro=Azevedo, cor=Verde";

	//	Sabonete sabonete2 = new Sabonete(teste);
	//	System.out.println(sabonete2);
	}

}
