package Polimorfismo_Heranca;

public class TesteCavalo {
	public static void main(String[] args) {
		Cavalo cavalo = new Cavalo ("Princesa", 22);
		
		cavalo.cavaloInfo();
		cavalo.getIdadeAnimal();
		cavalo.setSomAnimal();
		cavalo.setCorre(true);
		cavalo.imprirmirMovimento();
	}
}
