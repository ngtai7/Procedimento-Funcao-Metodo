import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		//Variáveis
		int linha, coluna, cl=0,cc=0;
		String sinal;
		boolean posicao;
		
		Scanner leitor = new Scanner(System.in);
 
		System.out.println("Movimentos de uma Torre no xadrez!");
		System.out.println("Digite a linha em que a Torre se encontra: ");
		linha = leitor.nextInt();
		System.out.println("Digite a coluna em que a Torre se encontra: ");
		coluna = leitor.nextInt();
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		//Variáveis
		int linha, coluna, l,c;
		String sinal;
		boolean posicao;
		//Início
		Scanner leitor = new Scanner(System.in);
 
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		//Variáveis
		int linha, coluna, l,c;
		String sinal;
		boolean posicao;
		//Início
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		//Variáveis
		int linha, coluna, l,c;
		String sinal;
		boolean posicao;
		//Início
		Scanner leitor = new Scanner(System.in);
 
		System.out.println("Movimentos de uma Torre no xadrez!");
		System.out.println("Digite a linha em que a Torre se encontra: ");
		linha = leitor.nextInt();
		System.out.println("Digite a coluna em que a Torre se encontra: ");
		coluna = leitor.nextInt();
		System.out.println("Movimentos possíveis:");
		
		if (linha>=1&&linha<=8&&coluna>=1&&coluna<=8)
		{//Desenho
		System.out.print("  1  2  3  4  5  6  7  8 "+"\n  -----------------------");
		for (l=1; l<=8; l++)
		{
		System.out.print("\n"+l+"|");
		for (c=1; c<=8; c++)
		{
			posicao = (linha<l||linha>l)&&(coluna<c||coluna>c);
			if (posicao == true)
				t();
			else
				f();
		}
		
		}
		}
		else
			System.out.println("Posição inválida!!!");

	    }
	
	public static void t()
	{
		System.out.print("-  ");
	}
	public static void f()
	{
		System.out.print("X  ");
	}
	
	
		
	}