
public class Quadrado implements AreaCalculavel {
	
	int lado = 8 ;

	@Override
	public void CalcularArea() {
		System.out.println("O c�lculo da Area do Quadrado � :");
		 System.out.println( Math.pow(lado,2 )); 
		 
	}

}
