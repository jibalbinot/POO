package POO;
public class Programa{
	public static void main(String[] args) {
		
		// instanciando um objeto
		Conta c1 = new Conta();
		
		c1.setNumero(7);
		c1.setTitular("Zé");
		c1.setLimite(5000);
		c1.deposita(100);
		c1.saca(5100);
		c1.deposita(30);
		c1.mostra();
		
		Conta c2 = new Conta();
		c2.setNumero(13);
		c2.setTitular("Maria");
		c2.saca(2000);
		c2.mostra();
		System.out.println(c2.getLimite());
		
		
	}
}