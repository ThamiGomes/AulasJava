import java.util.Objects;

public class Cliente {  //classe pública Cliente

	//atributos privados da classe Cliente
	private String nome;
	private int cpf;
	private int numConta;
	
	//construtor com o parâmetro vazio
	public Cliente() {
		
		
	}
// gerando getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	//toString para retornar os atributos
	@Override
	public String toString() {
		return "Cliente \n Nome=" + nome + ", \nCPF=" + cpf + ", \nNúmero da Conta=" + numConta + " \n*************************]";
	}

	//hashCode que compara os conteúdos dos objetos
	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, numConta);
	}

	//método equals serve para comparar objetos
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
	}
	
	
	
	
}
