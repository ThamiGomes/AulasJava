
public class Endereco {

	String Rua ;
	int n;
	String Bairro;
	 
	@Override
	public String toString() {
		return "Endereco [Rua=" + Rua + ", n=" + n + ", Bairro=" + Bairro + "]";
		
		
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	
}
