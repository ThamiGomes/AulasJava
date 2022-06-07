
public class Bebida {
	//atributos da super classe 
	private String nome;
	private boolean aquecer;
	
	//construtor que recebe os atributos
	public Bebida(String nome, boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
		
	} //método preparar
	public void preparar() {
		
	}
	// gerando getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAquecer() {
		return aquecer;
	}
	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	
	
}
