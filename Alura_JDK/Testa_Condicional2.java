package Alura_JDK;

public class Testa_Condicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >=2; //só pode ser true ou false
	
		//o if com modulos de "OR" ficaria if (idade >= 18 || quantidadePessoas >=2)
		//int não entra em boolean
		
		if (idade >= 18 && acompanhado) { //&& representa a expressão AND
			System.out.println("seja bem vindo");	
			} else {
				System.out.println("infelizmente você não pode entrar");
			}
		}	

}

