
public class Aplicacao {

	public static void main(String[] args) {
		
		Preparador preparador = new Preparador(); // Instanciando objeto Preparador
		
		LeiteQuente leiteQuente = new LeiteQuente(); // Intanciando objeto LeiteQuente
		preparador.prepararBebida(leiteQuente);  //chamando método  LeiteQuente
		
		Refrigerante refrigerante = new Refrigerante(); //Instanciando objeto Refri
		preparador.prepararBebida(refrigerante);
	}

}
