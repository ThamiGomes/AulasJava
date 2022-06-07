
public class Aplicacao extends Item {

	public static void main(String[] args) {
	
 // Item item = new Item (); //não é possivel criar uma instância de uma classe abtrata
		
		Item item = new Cogumelo(); //instanciando um objeto e criando uma variavel
		item.pegar(); //realizando açao pela classe cogumelo
		
		item = new Moeda(); // a variavel ja está criada
	    item.pegar(); //realizando açao pela classe moeda
		
		item = new Diamante();
		item.pegar(); //realizando açao pela classe diamante
		
		
	}

}
