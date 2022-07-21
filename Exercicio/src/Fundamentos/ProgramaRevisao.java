package Fundamentos;

import java.util.Scanner;

public class ProgramaRevisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		
		for (int x = 1; x <= 2; x++) {
			
			Usuario usuario = new Usuario();
			
			System.out.println("Digite o nome do " + x + "º usuário.");
			usuario.setNome(scanner.next());
			
			System.out.println("Digite a idade " + x + "º usuário.");
			usuario.setIdade(scanner.nextInt());
			
			System.out.println("Digite o valor do salário.");
			usuario.setSalario(scanner.nextInt());
			
		
		}
		Usuario usuario1 = new Usuario();
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Calcule a diferença dos salários ");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Digite o primeiro salário");
		int t = scanner.nextInt();
		
		System.out.println("Digite o segundo salário");
		int y = scanner.nextInt();	
		
		int subtrair = usuario1.subtrair(t, y);
		System.out.println("O resultado é" + subtrair + "!!!");

		
	}

}
