package JavaBlocoI_Vetor;

import java.util.Scanner;

public class Intro_Vetor_plataforma 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
		int[] arrayDois = {43,42,4,8,55,21,2,45};
		
		float[] nota=new float[5];
		
		//tamanho do array
		if (arrayDois.length>8) 
		{
			System.out.println ("Tamanho do ArrayDois - Maior que 8!");
		}
		else
		{
			System.out.println("Tamanho do ArrayDois - Menor que 8!");
		}
		System.out.println("\nTamanho do ArrayUm = "+arrayUm.length);
		
		//utiliza��o do for-each
		String[] cars = {"Volvo", "", "Ford", "Mazda"};
				
		for (String i : cars)
		{
			System.out.println(i);
		}
		
		//popula��o um array
		for(int i=0;i<5;i++)
		{
			System.out.println("Entre com uma nota: ");
		}
		
	}

}
