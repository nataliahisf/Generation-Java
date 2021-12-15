package JavaBlocoI_POO;

public class Cliente_ex1 

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

{
	
	private String nome;
	private String sobrenome;
	private String idade;
	
    public Cliente_ex1 (String nome, String sobrenome, String idade)
    {
    	this.nome = nome;
    	this.sobrenome = sobrenome;
    	this.idade = idade;
    }
    
    public void imprimirInfo()
    {
    	System.out.println("\nO cliente "+nome+" "+sobrenome+", "+idade+" ano(s) de idade.");
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
}
