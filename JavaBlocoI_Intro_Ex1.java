package JavaBlocoI;

import java.util.Scanner;

/*1. Fa�a um sistema que leia a idade de uma pessoa expressa
em anos, meses e dias e mostre-a expressa apenas em dias.*/

/*1 ano = 365 dias
1 m�s = 30 dias
1 dia = 1 dia*/

public class JavaBlocoI_Intro_Ex1
{

	public static void main (String args[])
	{
	
	Scanner leia = new Scanner(System.in);
	
	int anos,meses,dias,totalDias;
	
	System.out.println("\nDigite quantos anos voc� viveu: ");
	anos=leia.nextInt();
	
	System.out.println("\nDigite quantos meses viveu: ");
	meses=leia.nextInt();
	
	System.out.println("\nDigite quantos dias viveu: ");
	dias=leia.nextInt();
	
	totalDias = anos*365 + meses*30 + dias;
	
	System.out.println("\nVoc� viveu "+totalDias+" dias");
	}
	
}
