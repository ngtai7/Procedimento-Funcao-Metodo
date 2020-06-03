public class Exercicio3 {

	public static void main(String[] args) {

		
	}

	public static boolean media(double a, double b, double c, double d)
	{
		double m=0;
		m = (a+b+c+d)/4;
		boolean verificacao = m >= 7;
		
		if (verificacao == true)
		{System.out.println("Aprovado");}
		else if (verificacao == false && m>0)
		{System.out.println("Reprovado");}
		else
		{System.out.println("Valor inválido");}
		
		return verificacao;
	}
	
	
	
	
}
	