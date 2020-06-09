import java.util.Scanner;

public class explicando {

	public static void main(String[] args) {
		
    op(7, 8,'/');

		
	}
	
	public static void op(int a, int b, char c)
	{
		int x;
		
		if (c == '+')
		{x = a + b;
		System.out.println("soma="+x);}
		else if (c =='-')
		{x = a - b;
		System.out.println("subtração="+x);}
		else if (c =='*')
		{x = a*b;
		System.out.println("multiplicação="+x);}
		else if (c =='/' && b!=0)
		{x = a/b;
		System.out.println("divisão="+x);}
		else if (c =='/' && b==0)
			{System.out.println("Erro");}
		
	}




}