package Alura_JDK;

public class Testa_While {

	public static void main(String[] args) {
		
		int contador =0;
		while(contador <= 10) {
			System.out.println(contador);
	//contador = contador +1 resumido é o que está lá em baixo
			//contador +=1;
	// caso seja apenas uma unidade é o ++	
			contador++;
		}	
		System.out.println(contador);
	}

}
