package JavaBlocoI_Vetor;

import java.util.Scanner;

public class Intro_Vetor {

	public static void main(String args[]) 
	{
		// TODO Auto-generated method stub

		float n1,n2,n3,somaMedia=0,mediaGeral;
		float[] media = new float[4];
		int x;
		//String[] nome = new String[3];
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<4;x++)
		{
			System.out.println("\nEntre com n1: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com n2: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com n3: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/ 3;
			somaMedia += media[x]; 
		}
		mediaGeral = somaMedia / 4;
		System.out.printf("\nMédia Geral: %2.2f ",mediaGeral);
		
		for(x=0;x<4;x++)
		{
			System.out.println("\nMédia do alune "+(x+1)+" foi de: "+media[x]);
		}
	}

}

