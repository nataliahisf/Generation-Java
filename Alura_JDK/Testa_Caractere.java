package Alura_JDK;

public class Testa_Caractere {

	public static void main(String[] args) 
	{
	char letra = 'a'; //guarda apenas uma letra (com aspas simples).
	System.out.println(letra);	//String n�o � uma vari�vel primitiva
	
	char valor = 66;  //Tamb�m cabe n�meros, s� que apenas positivos e mostra como letras devido a tabela ASCII
	System.out.println(valor);
	
	valor = (char) (valor + 1); //um int n�o cabe em um char, pois � maior
	System.out.println(valor);
	
	String palavra = "alura curso online de tecnologia"; //cabe quantos caracteres quiser, incluindo nenhum
			System.out.println(palavra);
			
			
	palavra = palavra + 2020;	//String + qualquer coisa concatena e cria uma nova, n�o se comporta como um int e char	
	}

}
