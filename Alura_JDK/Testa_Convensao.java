package Alura_JDK;

public class Testa_Convensao {

	public static void main(String[] args) 
	{
		
		//Um valor inteiro pode ser compilado como double, mas não o contrário, a menos que se use...
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		//sem o int em parentese nãp compilaria
		
		           ///tipos primitivos
		// int = 32 bits = guarda até 2bilhoes
		//long = número grande = acima de 2bilhões
		//short = valor pequeno = menos que 16 bits (4 números)
		//byte só vai até 127
		
		          ///tipos futuantes
		//float 32 bits, menor que o double de 64 bits. 3.14f seria para indicar um número float
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total); //resultado 0.30000000000000004 é normal, por questões de engenharia
		
	}

}
