package Alura_JDK;

public class Testa_PontoFlutuante {

	public static void main(String[] args) 
	{
		double salario; //double usado para valores com pontos decimais
		salario = 1250.70;
		System.out.println("meu sal�rio � "+salario);

		double idade = 37;
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2; 
		/*� importante ressaltar que quando fazemos uma divis�o n�o exata, mas estamos dividindo n�meros inteiros, o Java sempre truncar� o resultado.
		 Nesse exemplo a sa�da ser� sempre2.*/
		System.out.println(outraDivisao);
		
		double novaTentativa = 5.0/2;
		/*mesmo com double � necess�rio colocar um .0 a um dos n�meros (no caso o 5) para que o resultado n�o d� truncado,
		 * com o valor da divis�o completa (2.5)*/ 
		 */
		System.out.println(novaTentativa);
	}

}
