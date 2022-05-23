
public class Usuario {

	String nome;
	int idade;
	
	Endereco endereco;
	
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
		
		
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
	
	
	
	
	}

		
	
	

