package JavaBlocoI;

import java.util.Scanner;

public class Comeco_Entrada_Saida {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int a,b,soma;
		
		System.out.println("Entre com o valor de a: ");
		a = leia.nextInt();
		
		System.out.println("Entre com o valor de b: ");
		b = leia.nextInt();
		
		soma = a+b;
		
		System.out.println(soma);
	}

}
