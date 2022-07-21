
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Padeiro padeiro = new Padeiro();
		Confeiteira confeiteira = new Confeiteira();
		
		Cozinhar(padeiro);
		Cozinhar(confeiteira);
		
		
		
	}

	private static void Cozinhar(Comidas a) {
		a.Cozinhar();
		
		
	}

	

}
