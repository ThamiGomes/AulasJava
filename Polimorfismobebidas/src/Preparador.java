
public class Preparador {

	public void prepararBebida(Bebida bebida) { //método prepararBebida em que o parametro é a bebida que será preparada
		
		System.out.println("Preparando a bebida" + bebida.getNome()); //Syso para mostrar na tela a bebida que esta sendo preparada
		System.out.println("Pegando copo"); //mostrar na tela
		
		bebida.preparar();
		if (bebida.isAquecer()) // if para saber se a bebida será aquecida
			System.out.println("Aquecendo a bebida" + bebida.getNome()); { //Syso para mostrar na tela que  bebida esta sendo aquecida
				
			}
			
	    System.out.println("Bebida preparada com sucesso!!\n"); //mostrar na tela que a bebida foi preparada
	}
}
