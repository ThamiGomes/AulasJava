
public enum Sexo {

	FEMININO(1),
	MASCULINO(2);
  	   
   

	private int num;

	
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
