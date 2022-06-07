
public enum DiaDaSemana { //classe Enum define um conjunto de valores constantes

	//os dias da semana tem um atributo Num
	DOMINGO(1),
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);
	
	private int num; //não tem acesso de fora, irá dizer o que cada dia receberá

	public int getNum() { //get para ter acesso a variavel privada
		return num;
	}	
	
	private DiaDaSemana(int num) {  // faz declarar os parametros das constantes
		this.num = num;
		

	
	}
	
}
