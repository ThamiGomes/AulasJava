
public class LeiteQuente extends Bebida { //Classe LeiteQuente que extends da super classe Bebida

	public LeiteQuente() {
		super("LeiteQuente", true); // O construtor estapegando informaçoes da super classe, dizendo o nome, e que é para a bebia ser aquecida
		
	}

	@Override
	public void preparar() { //usando metodo preparar da uper classe
		
		System.out.println("Colocando Leite Quente no copo"); //mostrandoinformaçoes na tela
		
	}

	
}
