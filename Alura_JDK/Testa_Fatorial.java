package Alura_JDK;

/*escreva um for que inicie uma vari�vel n (n�mero atual) como 1 e fatorial (resultado total) como 1.
 Fa�a seu la�o entre 1 a 10 e calcule o resultado!*/

public class Testa_Fatorial {
	    public static void main(String[] args) {
	        int fatorial = 1;
	        for (int i = 1; i < 11; i++) {
	            fatorial *= i;
	            System.out.println("Fatorial de " + i + " = " +fatorial);
	        }
	    }
	}

/*O fatorial � sempre o produto de n�meros consecutivos
inteiros de 1 at� o pr�prio n�mero. Ex: Fatorial de 4 = 4 x 3 x 2 x 1 = 24
ou fatorial de 4 = 4 x 3! = 24.
Com essa �ltima l�gica � que essa quest�o � feita.
Pegando sempre o n�mero que a gente quer e multiplicando pelo fatorial do n�mero anterior.
