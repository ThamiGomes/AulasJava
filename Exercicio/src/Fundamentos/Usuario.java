package Fundamentos;

public class Usuario {


	String nome;
	int idade;
	double salario ;
	int subtrair(int t, int y) {
				return t - y;
		}
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
 
	
	
}

	

	
	
	

