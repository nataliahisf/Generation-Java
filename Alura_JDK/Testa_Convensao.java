package Alura_JDK;

public class Testa_Convensao {

	public static void main(String[] args) 
	{
		
		//Um valor inteiro pode ser compilado como double, mas n�o o contr�rio, a menos que se use...
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		//sem o int em parentese n�p compilaria
		
		           ///tipos primitivos
		// int = 32 bits = guarda at� 2bilhoes
		//long = n�mero grande = acima de 2bilh�es
		//short = valor pequeno = menos que 16 bits (4 n�meros)
		//byte s� vai at� 127
		
		          ///tipos futuantes
		//float 32 bits, menor que o double de 64 bits. 3.14f seria para indicar um n�mero float
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total); //resultado 0.30000000000000004 � normal, por quest�es de engenharia
		
	}

}
