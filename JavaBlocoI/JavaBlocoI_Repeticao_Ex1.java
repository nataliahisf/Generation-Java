package JavaBlocoI;

import java.util.Scanner;

public class JavaBlocoI_Repeticao_Ex1
{

	public static void main(String[] args)
	
/*1- Informar todos os números de 1000 a 1999
que quando divididos por 11 obtemos resto = 5. (FOR)*/	
	{
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		
		int num=1000;
		
		for(num=1000;num<=1999;num++)
		{
			if (num%11 == 5)
			{
			System.out.printf("\n %d",num);
			}		 
		}

	}

}
