package JavaBlocoI_Vetor;

import java.util.Scanner;

public class Intro_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Entre com 9 n�meros e ao final 
		//some apenas os n�meros m�ltiplos de 3.
		
		int[][] numeros = new int[3][3];
		int somaMultiplo3 = 0,linha,coluna,somaDiagonal=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com um n�mero: ");
				numeros[linha][coluna] = leia.nextInt();
				
				if(numeros[linha][coluna] % 3 == 0)
				{
					somaMultiplo3 += numeros[linha][coluna];
				}
				if(linha == coluna)
				{
					somaDiagonal += numeros[linha][coluna];
				}
			}
		}
		System.out.println("\nSomat�rio dos n�meros m�ltiplos de 3: "+somaMultiplo3);
	}

}

