
public class Contador {

	private static int valor;
	
//	public Contador(int valor) {	
//		this.valor = valor = 1;
	
	static {
		valor = 1;
	}
	public void incrementar() {
		valor ++;
	}	

	public int getValor() {
		return valor;
	}
	public void setValor( int valor) {
    	this.valor = valor;
	
	}
}
