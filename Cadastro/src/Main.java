import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		
		
		for (int x =1; x<= 4; x++) {
			
		
		Usuario usuario = new Usuario();
		
		
		List lista = new ArrayList();
		
		lista.add("Nome");
		lista.add(0);
		lista.add("Rua");
		lista.add(0);
		lista.add("Bairro");
		
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Digite o nome" + x);	
		String nome = scanner.nextLine();
		
		Usuario.setIdade();
		System.out.println("Digite sua idade");
		int idade  = scanner.nextInt();
		
        
		
		System.out.println("Digite o nome da sua rua");
		String Rua  = scanner.nextLine();
		
		
		System.out.println("Digite o numero da casa");
		int n = scanner.nextInt();
		
		System.out.println("Digite o Bairro");
		String Bairro  = scanner.nextLine();
	
	}

	}
}
