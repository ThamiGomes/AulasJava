
public class Sabonete {

	//atributos privados da classe Sabonete
	 String cheiro;
	 String cor;
	 
	// toString para retornar todos os atributos dos sabonetes
	@Override
	public String toString() {
		return "Sabonete: cheiro=" + cheiro + ", cor=" + cor ;	

		
	}
	//construtor que define os parâmetros para instanciar objetos
	public Sabonete(String cheiro, String cor) {
		super();
		this.cheiro = cheiro;
		this.cor = cor;
	}
	public Sabonete(String texto) { //construtor com o parâmetro de String
		
		String[] arrayAuxiliar1 = texto.split(","); //split usado para quebrar o toString a cada vírgula que aparecer
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("="); //criando uma nova variável para pegar a posição 0 da arrayAuxiliar1 e dividir quando aparecer o =
		this.cheiro = arrayAuxiliar2[1].trim(); //o trim remove os espaços 
		
		String[] arrayAuxiliar3= arrayAuxiliar1[1].split("=");
		this.cor = arrayAuxiliar3[1].trim();
	}
	
}
