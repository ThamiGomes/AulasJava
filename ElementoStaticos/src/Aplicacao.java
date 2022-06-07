
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Matematica matematica = new Matematica();
		
		int resultado = matematica.somar(2, 3); //como os métodos são estáticos, não será preciso instanciar um objeto colocando o resultado da soma de dois números na variável 'resultado' ,o parâmetro são os 2 valores que serão somados
	//	System.out.println(resultado);
	//	resultado= matematica.subtrair(10, 4);
	//	System.out.println(resultado); //Syso para mostrar o resultado na tela
		
	//	int resultado = Matematica.somar(2, 4);
		System.out.println(resultado);  //Syso para mostrar o resultado na tela
		resultado = Matematica .subtrair(10, 11);
		System.out.println(resultado);  //Syso para mostrar o resultado na tela
		
	//	Contador contador1 = new Contador() ;
	//	Contador contador2 = new Contador() ;
	//	Contador contador3 = new Contador() ;
	//	contador1.incrementar();
				
	//	System.out.println(contador1.getValor);
	//	System.out.println(contador2.getValor());
	//	System.out.println(contador3.getValor());
		
	//	Contador.incrementar();
		
	//	System.out.println(Contador.getValor());
		
		System.out.println(Constante.MEDIA_DA_PROVA); //mostrando o valor da constante
		
	}

}
