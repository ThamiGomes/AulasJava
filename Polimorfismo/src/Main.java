
public class Main {

	public static void main(String[] args) {
		

	//  animais animais= new Cachorro();
	//	animais.Falar(): 
	//  animais = new Gato();
	//  animais.Falar();	
		
		
		Gato gato= new Gato();
		Cachorro cachorro= new Cachorro();
		falar(gato);
		falar(cachorro);
	}

	public static void falar(Animais a) {
		a.Falar();
		
		if(a instanceof Cachorro) {
			Cachorro c = (Cachorro) a;
			c.Morder();
			
		}
	}
}
