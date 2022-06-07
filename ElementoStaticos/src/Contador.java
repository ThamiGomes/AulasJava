
public class Contador {

	private static int valor;  //variável static, ou seja, o valor de uma variável não varia
	
//	public Contador(int valor) {	
//		this.valor = valor = 1;
	
	static { 
	//variável static, o valor de uma variável não varia
		valor = 1; // variavel inicia com o valor 1
	}
	public void incrementar() {
		valor ++;  //incrementa em 1 a variável
	}	

	// gerando métodos getters and setters para acessar os atributos privados
	public int getValor() {
		return valor;
	}
	public void setValor( int valor) {
    	this.valor = valor;
	
	}
}
