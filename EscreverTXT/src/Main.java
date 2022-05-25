import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

	     Sabonete sabonete1 = new Sabonete("Gardênia" , "verde" );
	     Sabonete sabonete2 = new Sabonete("Lavanda" , "Roxo" );
	     Sabonete sabonete3 = new Sabonete("Morango" , "Rosa" );
		
		List<Sabonete> listaDeSabonetes = new ArrayList<Sabonete>();
		
		listaDeSabonetes.add(sabonete1);
		listaDeSabonetes.add(sabonete2);
		listaDeSabonetes.add(sabonete3);
		
		String s = "texto para ser gravado no arquivo";
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
		   for(Sabonete sabonete : listaDeSabonetes)
			   escrever.write(sabonete.toString());
		
		}
	}

}
