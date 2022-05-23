
public enum Sexo {

	FEMININO(1),
	MASCULINO(0);
	
	private int num;

	
	public int getNum() {
		return num;
	}


	private Sexo(int num) {
		this.num = num;
	}
	
	
}
