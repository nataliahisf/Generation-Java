package JavaBlocoI;

import java.util.Scanner;

public class JavaBlocoI_Cond_Ex2

/*2-	Faça um programa que entre com três números e coloque em ordem crescente.
                           Valor1 > Valor2 > Valor3
                           Valor1 > Valor3 > Valor2
                           Valor2 > Valor1 > Valor3
                           Valor2 > Valor3 > Valor1
                           Valor3 > Valor2 > Valor1
                           Valor3 > Valor1 > Valor2
 */

{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int valor1,valor2,valor3;
		
		System.out.println("Digite o valor 1: ");
		valor1 = leia.nextInt();
		
		System.out.println("\nDigite o valor 2: ");
		valor2 = leia.nextInt();
		
		System.out.println("\nDigite o valor 3: ");
		valor3 = leia.nextInt();
		
		if (valor1 >= valor2 && valor2 >=valor3)
		{
			System.out.println("\nA ordem crescente é: " +valor1+ ", " +valor2+ " e " +valor3+ ".");
		}
		
		if (valor1 >= valor3 && valor1 >= valor2)
		{
			System.out.println("\nA ordem crescente é: " +valor1+", " +valor3+ " e " +valor3+ ".");
		}
		
		if (valor2 >= valor1 && valor2 >= valor3)
		{	
			System.out.println("\nA ordem crescente é:" +valor2+ ", " +valor1+ " e " +valor3+ ".");
		}
		
		
	}
}
