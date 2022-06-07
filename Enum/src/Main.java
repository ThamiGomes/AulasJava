
public class Main {

	public static final double PI = 3.14; //determina que é constante
	
	private enum Sexo{ //criando um Enum dentro da própria classe
		MASCULINO, FEMININO; //definindo constantes
	}
	
	
	public static void main(String[] args) {
		
		double pi = Main.PI;
		DiaDaSemana hoje= DiaDaSemana.SEGUNDA; //colocando o endereço do objeto SEGUNDA
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		System.out.println(num);

		String s = "TERCA"; //(s) correspondera a TERCA
        hoje = DiaDaSemana.valueOf(s); //vai procurar Na lista de constantes "DiaDaSemana" um valor que corresponda a (s)
        
        System.out.println(hoje.getNum());  //Syso para motrar o número correspondente do dia
        
	//criaçã de um Enum dentro da classe	
        Sexo sexo = Sexo.FEMININO; 
        sexo= Sexo.MASCULINO;
   }

	
}
