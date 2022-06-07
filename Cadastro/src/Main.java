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

		List<Usuario> listaUsuarios = new ArrayList<>();  //criando uma lista de usuarios da classe "usuario"
		Scanner scanner = new Scanner(System.in); //instanciando e criando objeto Scanner

		for (int x = 1; x <= 4; x++) { //usamos o for para dar limites na quantidade de usuarios que irão poder se cadastrar 

			Usuario usuario = new Usuario(); //instanciando e criando objeto Usuario

			//Syso usado para imprimir informações na tela
			//set para salvar o que usuário digitou na variável
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
			

			System.out.println("Digite o seu Sexo");
			
			System.out.println("Feminino =1 ou masculino =2");
			
			int sexo = 0; //sexo irá entrar como valor de 0
			while (sexo != 1 && sexo != 1) { // O while ele testa primeiro e depois faz
				sexo = scanner.nextInt();
				if (sexo == 1) //Usuario feminino usara 1
					usuario.setSexo(Sexo.FEMININO); // usando o set para adicionar o atributo na variável

				else if (sexo == 2) { //usuario masculino usara 2
					usuario.setSexo(Sexo.MASCULINO); // usa o set para adicionar o atributo na variável

				} else {
					System.out.println("Erro");
					System.out.println("Feminino =1 ou masculino = 2");
                              // se o usuario digitar algo diferente de 1 ou 2, irá dar erro
				}

			}
			listaUsuarios.add(usuario);
		}
                // usar try se der algum erro, ele indicara o erro
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))) { //criando um objeto de escrita
			//bufferedWrite é uma memória temporária usada para escrever,
			//entrada.txt é o local onde irá aparecer as palavras que forem escritas
			for (Usuario usuario : listaUsuarios) { //para a lista de usuário, irá escrever as palavras no txt
				escrever.write(usuario.toString()); //recebendo a variável que contem escrita
			}

			List<Usuario> listaUsuariosLidos = new ArrayList<>(); // criando listausuariosLidos da classe <Usuario>

			try (BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) { //BufferedReader é usado para ler o que estiver escrito na entrada txt
				
				String line;

				while ((line = reader.readLine()) != null) { //lendo a linha se não for diferente de null 
                                 //reader line = lendo linha 
					// != diferente
					Usuario Usuario = new Usuario(line); // criando um objeto que recebeu a string Line que leu toda a escrita
					
					listaUsuariosLidos.add(Usuario); //adicionando a nova variável que teve a escrita lida na listUsuáriosLidos
					
				
				}
				for (Usuario UsuariosLidos : listaUsuariosLidos)
					System.out.println(UsuariosLidos.toString());
				//para a listaUsuáriosLidos, irá mostrar a escrita na tela
			}
		}

	}

}
