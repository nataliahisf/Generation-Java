package Alura_JDK;

public class Testa_PontoFlutuante {

	public static void main(String[] args) 
	{
		double salario; //double usado para valores com pontos decimais
		salario = 1250.70;
		System.out.println("meu salário é "+salario);

		double idade = 37;
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2; 
		/*É importante ressaltar que quando fazemos uma divisão não exata, mas estamos dividindo números inteiros, o Java sempre truncará o resultado.
		 Nesse exemplo a saída será sempre2.*/
		System.out.println(outraDivisao);
		
		double novaTentativa = 5.0/2;
		/*mesmo com double é necessário colocar um .0 a um dos números (no caso o 5) para que o resultado não dê truncado,
		 * com o valor da divisão completa (2.5)*/ 
		 */
		System.out.println(novaTentativa);
	}

}
