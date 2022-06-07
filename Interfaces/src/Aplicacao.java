
public class Aplicacao {

	public static void main(String[] args) {
		

		Rota rota = new Rota(); //instanciando objeto da classe Rota
		Ferrari ferrari = new Ferrari(); //instanciando objeto da classe Ferrari
		Fusca fusca = new Fusca(); //instanciando objeto da classe Fusca
		
	//	aplicando métodos nos objetos
		rota.ir(ferrari); 
		rota.ir(fusca);
	//
	//	Automovel automovel = new Ferrari(); //instaciando objeto da classe Ferrari
	//	rota.ir(automovel);
	//	automovel = new Fusca();
	//	rota.ir(automovel);
		
		
		Vendedor vendedor = new Vendedor(); //instaciando objeto da classe Vendedor
		Apartamento apartamento = new Apartamento(); //instaciando objeto da classe Apartamento
		
		vendedor.mostrarPreco(apartamento); //aplicando métodos nos objetos
		vendedor.mostrarPreco(ferrari); //aplicando métodos nos objetos
		
		
		
	}

}
