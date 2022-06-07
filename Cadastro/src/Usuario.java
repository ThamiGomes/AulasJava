
public class Usuario {

	String nome; //atributos do Usuário
	int idade;
	Sexo sexo; //atributo endereço que vem da classe endereço
	Endereco endereco;  //sexo que vem do Enum Sexo
		

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", endereco=" + endereco + "]";
	}

	//gerando getters and setters
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Usuario(String linha) {  //construtor com o parâmetro de String
		
		String[] arrayLinha = linha.split(","); //split usado para quebrar o toString quando aparecer a ","
		String[] arrayNome = arrayLinha[0].split("="); //cria uma nova variável para pegar a posição 0 da arrayLinha e quebrar quando aparecer o =	
		this.nome = arrayNome[1].trim();
		
		String[] arrayIdade = arrayLinha[1].split("=");
		this.idade = Integer.parseInt(arraylinha[1].trim()); //converte a string da Array em inteiro com o Integer.parseInt
		
		this.sexo = Sexo.valueOf(arraySexo[2].trim()); //converte a string da Array em Enum com o valueOf
		
		Endereco endereco = new Endereco(arrayLinha); //intanciando um novo objeto da classe Endereco que recebe a (arrayLinha)
		
		this.endereco = endereco;
		
	}



	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	}

		
	
	

