
public enum Sexo {

	//definindo constantes que serão usadas pela classe Usuário
	FEMININO(1),
	MASCULINO(2);
  	   
   

	private int num; //variavel privada NUm

	//gerando getters and setters Num
	public int getNum() {
		return num;
	}


	private Sexo(int num) {
		this.num = num;
	}


	public void setNum(int num) {
		this.num = num;
	}
	
}
