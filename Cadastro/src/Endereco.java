
public class Endereco {

	String Rua ;
	int numero;
	String Bairro;
	 
	public Endereco(String[] arrayLinha) {
		
		String[] arrayRua = arrayLinha[3].split("=");
		this.Rua = arrayRua[1].trim();
		
		
	}

	@Override
	public String toString() {
		return "Endereco [Rua=" + Rua + ", numero=" + numero + ", Bairro=" + Bairro + "]";
	}		

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	
}