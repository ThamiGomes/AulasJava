
public class Usuario {

	String nome;
	int idade;
	Sexo sexo;
	Endereco endereco;
		

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", endereco=" + endereco + "]";
	}

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
	
	public Usuario(String linha) {
		
		String[] arrayLinha = linha.split(",");
		String[] arrayNome = arrayLinha[0].split("=");		
		this.nome = arrayNome[1].trim();
		
		String[] arrayIdade = arrayLinha[1].split("=");
		this.idade = Integer.parseInt(arraylinha[1].trim());
		
		this.sexo = Sexo.valueOf(arraySexo[2].trim());
		
		Endereco endereco = new Endereco(arrayLinha);
		
		this.endereco = endereco;
		
	}



	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	}

		
	
	

