package JavaBlocoI;

import java.util.Scanner;

public class JavaBlocoI_Cond_Ex1
{

	public static void main(String[] args)
{
		// TODO Auto-generated method stub

//1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.		
	

	int valor1,valor2,valor3;
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Entre com valor 1: ");
	valor1 = leia.nextInt();
	
	System.out.println("\nEntre com valor 2: ");
	valor2 = leia.nextInt();
	
	System.out.println("\nEntre com valor 3: ");
	valor3 = leia.nextInt();
	
	if (valor1 >= valor2 && valor1 >= valor3)
	{
		System.out.println("\nO maior valor � "+valor1);
	}
	
	else if (valor2>= valor1 && valor2>= valor3)
	{
		System.out.println("\nO maior valor � "+valor2);
	}
	
	else if (valor3>=valor1 && valor3>=valor2)
	{
		System.out.println("\nO maior valor � "+valor3);
	}
	
		
}
	
}
