
public class Aplicacao {

	public static void main(String[] args) {
		
		Preparador preparador = new Preparador(); // Instanciando objeto Preparador
		
		LeiteQuente leiteQuente = new LeiteQuente(); // Intanciando objeto LeiteQuente
		preparador.prepararBebida(leiteQuente);  //Chamando método preparar bebida LeiteQuente
		
		Refrigerante refrigerante = new Refrigerante(); //Instanciando objeto Refrigerante
		preparador.prepararBebida(refrigerante); //Chamando método preparar bebida
	}

}
