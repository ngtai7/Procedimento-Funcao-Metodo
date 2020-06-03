public class Exercicio2 {

	public static void main(String[] args) {
		
	}

	public static int soma(int a, int b)
	{
		int s=0;
		
		if (a<b) {
		while (a<=b)
		{s+=a;
		a++;}
		}
		else if (a>b)
		{while (b<=a)
			{s+=b;
		    b++;}
			}
		else
		{s=2*a;}
		
		System.out.println("O resultado da soma é: "+s);
		return s;
		
		
	}
	    
}