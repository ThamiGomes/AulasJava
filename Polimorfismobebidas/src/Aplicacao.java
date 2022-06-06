
public class Aplicacao {

	public static void main(String[] args) { //Utlização classe main para executar programa
		
		Preparador preparador = new Preparador(); // Instanciando objeto da classe Preparador 
		
		LeiteQuente leiteQuente = new LeiteQuente(); // Intanciando objeto da classe LeiteQuente
		preparador.prepararBebida(leiteQuente);  //Chamando método prepararBebida da classe "preparador" para preparar LeiteQuente 
		
		Refrigerante refrigerante = new Refrigerante(); //Instanciando objeto da classe Refrigerante
		preparador.prepararBebida(refrigerante); //Chamando método prepararBebida da classe "preparador" para preparar Refrigerante
	}

}
