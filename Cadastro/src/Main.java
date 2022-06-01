import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		List<Usuario> listaUsuarios = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		for (int x = 1; x <= 4; x++) {

			Usuario usuario = new Usuario();

			System.out.println("Digite o nome do " + x + "º usuário");
			usuario.setNome(scanner.nextLine());

			System.out.println("Digite a idade " + x + "º usuário");
			usuario.setIdade(scanner.nextInt());

			usuario.setEndereco(new Endereco());

			System.out.println("Digite o nome da rua");
			usuario.getEndereco().setRua(scanner.nextLine());

			System.out.println("Digite o numero da casa");
			usuario.getEndereco().setNumero(scanner.nextInt());

			System.out.println("Digite o Bairro");
			usuario.getEndereco().setBairro(scanner.nextLine());
			// o while ele testa primeiro e depois faz

			System.out.println("Digite o seu Sexo");
			
			System.out.println("Feminino =1 ou masculino =2");

			int sexo = 0;
			while (sexo != 1 && sexo != 1) {
				sexo = scanner.nextInt();
				if (sexo == 1)
					usuario.setSexo(Sexo.FEMININO);

				else if (sexo == 2) {
					usuario.setSexo(Sexo.MASCULINO);

				} else {
					System.out.println("Erro");
					System.out.println("Feminino =1 ou masculino = 2");

				}

			}
			listaUsuarios.add(usuario);
		}

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))) {
			for (Usuario usuario : listaUsuarios) {
				escrever.write(usuario.toString());
			}

			List<Usuario> listaUsuariosLidos = new ArrayList<>();

			try (BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
				String line;

				while ((line = reader.readLine()) != null) {

					Usuario Usuario = new Usuario(line);
					
					listaUsuariosLidos.add(Usuario);
					
				
				}
				for (Usuario UsuariosLidos : listaUsuariosLidos)
					System.out.println(UsuariosLidos.toString());
			}
		}

	}

}