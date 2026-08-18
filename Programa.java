package POO;
public class Programa{
	public static void main(String[] args) {
		
		// instanciando um objeto
		
		Cliente cli1 = new Cliente();
		cli1.setCpf("1234");
		cli1.setNome("Zé");
		
		Conta c1 = new Conta();
		c1.setNumero(7);
		c1.setTitular(cli1);
		c1.setLimite(5000);
		c1.deposita(100);
		c1.saca(100);
		c1.deposita(30);
		c1.mostra();
		
		Conta c2 = new Conta();
		c2.setNumero(13);
		c2.setTitular(cli1);
		c2.mostra();
		System.out.println(c2.getLimite());

		c1.transfere(c2, -10000);
		c1.mostra();
		c2.mostra();
		
		
	}
}