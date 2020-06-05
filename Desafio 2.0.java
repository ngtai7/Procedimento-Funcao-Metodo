import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		//Variaveis
		int i,j,l,c;
		
		System.out.println("Digite a linha da torre: ");
		Scanner leitor = new Scanner(System.in);
		l = leitor.nextInt();
		System.out.println("Digite a coluna da torre: ");
		c = leitor.nextInt();
		
		if (l>8||l<=0||c>8||c<=0)
		    System.out.println("Posição inválida!!!");
		else
		{   System.out.println("Movimentos possíveis"+"\n");
		    System.out.println("   1  2  3  4  5  6  7  8");
		    System.out.println("   ----------------------");
		    for (i=1;i<=8;i++)
		{
			System.out.print(i+"| ");
			for (j=1;j<=8;j++)
			{
				if (l==i||c==j)
				System.out.print("X  ");
				else
				System.out.print("-  ");
			}
			System.out.println("");
		}
		
		}
		
	}

}
