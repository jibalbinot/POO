package POO;

import java.util.Scanner;

public class Programa{
	public static void main(String[] args) {
		
		System.out.println("PI: "+Math.PI);
		System.out.println("Número randômnico: "+Math.random());

		System.out.println("Contas criadas: "+Conta.getContador());
		
		// leitura de dados do usuário
		Scanner s = new Scanner(System.in);
		String nome, cpf;
		System.out.print("Informe seu nome: ");
		nome = s.nextLine();
		System.out.print("Informe seu cpf: ");
		cpf = s.nextLine();
		s.close();

		// instanciando um objeto
		Cliente cli1 = new Cliente(nome,cpf);
		Cliente cli2 = new Cliente("Pedro","456");
		cli1.mostra();
		cli2.mostra();
		
	
		
		Conta c1 = new Conta();
		c1.setTitular(cli1);
		c1.setLimite(5000);
		c1.deposita(100);
		c1.saca(100);
		c1.deposita(30);
		c1.mostra();
		
		Conta c2 = new Conta();
		c2.setTitular(cli2);
		c2.mostra();
		System.out.println(c2.getLimite());

		c1.transfere(c2, -10000);
		c1.mostra();
		c2.mostra();

		Conta c3 = new Conta();
		c3.mostra();
	
		System.out.println("Contas criadas: "+Conta.getContador());
	}
}