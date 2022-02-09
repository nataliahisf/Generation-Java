package Alura_JDK;

public class Testa_Caractere {

	public static void main(String[] args) 
	{
	char letra = 'a'; //guarda apenas uma letra (com aspas simples).
	System.out.println(letra);	//String não é uma variável primitiva
	
	char valor = 66;  //Também cabe números, só que apenas positivos e mostra como letras devido a tabela ASCII
	System.out.println(valor);
	
	valor = (char) (valor + 1); //um int não cabe em um char, pois é maior
	System.out.println(valor);
	
	String palavra = "alura curso online de tecnologia"; //cabe quantos caracteres quiser, incluindo nenhum
			System.out.println(palavra);
			
			
	palavra = palavra + 2020;	//String + qualquer coisa concatena e cria uma nova, não se comporta como um int e char	
	}

}
