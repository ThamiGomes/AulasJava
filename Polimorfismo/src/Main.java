
public class Main {

	public static void main(String[] args) {
		

	//  animais animais= new Cachorro();
	//	animais.Falar(): 
	//  animais = new Gato();
	//  animais.Falar();	
		
		
		Gato gato= new Gato(); //criando  um objeto do tipo gato na heap. A variável "gato" aponta para a classe Gato.
		Cachorro cachorro= new Cachorro();  //criando  um objeto do tipo cachorro na heap. A variável "Cachorro" aponta para a classe Cachorro.
		
		//o método falar precisa de um parâmetro dentro de "Animal"
		falar(gato); 
		falar(cachorro);
	}

	public static void falar(Animais a) { // o A representa um Animal
		a.Falar();
		
		 // instanceof é um operador de comparação. A resposta será true ou será false. O  instanceof vê se o objeto é da classe que esta comparando.
		
		if(a instanceof Cachorro) {
			Cachorro c = (Cachorro) a;
			c.Morder();
			
		}
	}
}
