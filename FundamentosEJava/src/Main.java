

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
// *********** IF ELSE *************

//		int x = 100;
//		double y = 200;
//		int a = 0;
//		double b = 0;
//		short z = (short) 100000;
//		System.out.println(z);
//
//		byte t = 100;
//		System.out.println(t);
//
//		a = (int) y;
//		b = x;
//
//		System.out.println(a);
//		System.out.println(b);
//
//		int idadePessoa = 25;
//
//		if (idadePessoa < 20) {         //condição lógica
//			System.out.println("Você não pode beber");
//		} else if (idadePessoa < 80) {
//			System.out.println("Bora tomar uma");
//		} else {
//			System.out.println("Quanto é a sua aposentadoria?");
//		}
//		System.out.println("Você tem " + idadePessoa);

		// System.out.println(-------------------------------------------);
		
		// *********** SWITCH CASE *************

//		int num = 9;
//
//		switch (num) {  //switch case usado para TESTAR o conteúdo da variável, quando os valores são CONSTANTES
//		case 1:
//			System.out.println("Segunda " );
//			break;                           //BREAK é usado pois, se não for, tudo que está depois da verificação será executado
//		case 2:
//			System.out.println("Terça" );
//			break;
//		case 3:
//			System.out.println("Quarta " );
//			break;
//		case 4:
//			System.out.println("Quinta"  );
//			break;
//		case 5:
//			System.out.println("Sexta " );
//			break;
//		case 6:
//			System.out.println("Sábado " );
//			break;
//		case 7:
//			System.out.println("Domingo" );
//			break;
//			default:                       //se nenhum dos casos for verdadeiro, aparecerá o que está no default
//				System.out.println("Esse número não representa um dia da semana");

		// }
		// System.out.println(------------------------------------------);
		
		// *********** WHILE DO *************
		
//		int x = 8;
//		while (x<10) {               //enquanto x for menor que 8, é para ser executado o programa
//			System.out.println(x);
//			x = x + 1;
//		
//	}
//		
//	int x=10;
//		
//		do {
//			System.out.println(x);      //x aparecerá na tela enquanto ele for menor que 15
//		x=x+1;
//	}while(x<15); 

		// ************ TABUADA (FOR) **************
//Scanner ler = new Scanner(System.in); //scanner para receber informação do usuário
//System.out.println("Qual número deseja realizar a tabuada?");
//
//int y;
//
//y = ler.nextInt();            //lendo informação do usuário
//
//	for(int x=0;  x<11; x++) {  // X iniciará em 0 e somará 1 (++) até o x sendo menor que 11.
//		System.out.println(y + "x" + x + "= " + x*y);
//		
//
//
//		// *********** MATRIZES *************
//		int x1 = 3;
//		int y1 = 4;
//		int z1 = 5;
//
//		System.out.println(x1); // sem as matrizes teríamos que fazer vários Sysos
//		System.out.println(y1);
//		System.out.println(z1);
//		System.out.println();
//
//		double x[] = { 3, 4, 5, 6 }; // já está determinando que a matriz tem 4 espaços(length).
//		// java entende que um objeto está sendo construído.
//
//		for (int aux = 0; aux < x.length; aux++) { // o programa vai executar até o auxiliar(aux) ser menor que a
//													// quantidade de índices(4 nesse caso).
//
//			
//			System.out.println("Valor do índice " + aux + " = " + x[aux]);  //x[aux] será substituída pelo conteúdo
//
//		}
//		System.out.println();
//
//		String nome[] = { "Rafael", "Gislene", "Lara" }; // já está determinando que a matriz tem 3 espaços
//
//		for (int aux1 = 0; aux1 < nome.length; aux1++) { // o programa vai executar até o auxiliar(aux) ser menor que a
//								// quantidade de índices(3 nesse caso).
//			System.out.println(nome[aux1]);
//
//			if (nome[aux1] == "Gislene") { // condição para descobrir em qual índice "Gislene" está alocado
//				System.out.println("O índice de Gislene é " + aux1);
//
//			}
//
//		}
//		System.out.println();
//		int[] arrayInt = new int[5]; // instância de um objeto de Matriz. Define que os objetos recebem inteiros
//		
//		String[] ArrayString = new String[4];
//		double[] ArrayDouble = new double[4];
//
//		arrayInt[3] = 4; // na posição 3, o número quatro está sendo alocado.
//
//		int[] numero = new int[6];  //variável número recebe 6 posições(de 0 a 5)
//		
//		Scanner teclado = new Scanner(System.in); // scanner para receber informação do usuário
//
//		for (int aux2 = 0; aux2 < numero.length; aux2++) { // o programa vai executar até o auxiliar(aux) ser menor que
//															// a quantidade de posições da matriz(6 nesse caso).
//			System.out.println("Digite um número qualquer:");
//			numero[aux2] = teclado.nextInt();   ;;
//
//		}
//
//		for (int aux2 = 0; aux2 < numero.length; aux2++) {
//			System.out.println("índice " + aux2 + " = " + numero[aux2]); // vai mostrar qual é o valor alocado em cada
//																			// índice
//		}
		
		int[] arrayQualquer = new int[3];
		
		Object[] arrayObject = new Object[5]; //matriz do tipo objeto consegue receber qualquer coisa
		
		arrayObject[0] = 12; //a matriz receberá 12 na posição 0
		arrayObject[1] = "Rafaella"; //recebendo String
		arrayObject[2] = 8.7; //recebendo double
		arrayObject[3] = true; //recebendo boolean
		arrayObject[4] = arrayQualquer; //uma array dentro de outra

		for (int aux2 = 0; aux2 < arrayObject.length; aux2++) { 
			System.out.println("índice " + aux2 + " = " + arrayObject[aux2]);
			
		}	
		
		//***********MATRIZ BIDIRECIONAL(COM LINHAS E COLUNAS)************
			
			int[][] arrayBidirecional = new int[4][3]; //arrayBidirecional é o nome da matriz
			//[4] é o número de linhas e [3] é o número de colunas
			arrayBidirecional[0][0] = 4;  //adicionando valor para cada linha e coluna
			arrayBidirecional[2][1] = 8;

			
			for (int linha = 0; linha < arrayBidirecional.length; linha++) { 
			
				for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {  // o programa vai executar até o auxiliar(aux) ser menor que a
//													// quantidade de índices
					System.out.print("  Índice [" + linha + "] ["+ coluna+"] = " + arrayBidirecional [linha][coluna] + " " );
				}  //mostrar na tela os valores alocados na matriz
			
				System.out.println();  //pular linha
			}
		
	}

}
