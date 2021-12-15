package JavaBlocoI_POO;

public class Aviao_ex2 

/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

{
	
	private String companhia;
	private String voo;
	private String saidaAeroporto;
	private String chegadaAeroporto;
	
    public Aviao_ex2 (String companhia, String voo, String saidaAeroporto, String chegadaAeroporto)
    {
    	this.companhia = companhia;
    	this.voo = voo;
    	this.saidaAeroporto = saidaAeroporto;
    	this.chegadaAeroporto = chegadaAeroporto;
    }
    
    public void imprimirInfo()
    {
    	System.out.println("\nO Informações: "+companhia+" "+voo+", "+saidaAeroporto+"e chegada ao aeroporto as "+chegadaAeroporto+"");
    }

	public String getcompania() 
	{
		return companhia;
	}
	public void setcompanhia(String companhia) 
	{
		this.companhia = companhia;
	}

	public String getvoo() 
	{
		return voo;
	}
	public void setvoo(String voo) 
	{
		this.voo = voo;
	}

	public String getsaidaAeroporto() 
	{
		return saidaAeroporto;
	}

	public void setsaidaAeroporto(String saidaAeroporto) 
	{
		this.saidaAeroporto = saidaAeroporto;
	}
	
	public String getchegadaAeroporto() 
	{
		return chegadaAeroporto;
	}
	public void setchegadaAeroporto(String chegadaAeroporto) 
	{
		this.chegadaAeroporto = chegadaAeroporto;
	}
}