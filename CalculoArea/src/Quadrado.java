
public class Quadrado implements AreaCalculavel {
	
	int lado = 8 ;

	@Override
	public void CalcularArea() {
		System.out.println("O cálculo da Area do Quadrado é :");
		 System.out.println( Math.pow(lado,2 )); 
		 
	}

}
