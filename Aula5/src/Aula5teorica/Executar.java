package Aula5teorica;

import java.util.Scanner;

public class Executar {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		Conta c1 = new Conta();
		
		c1.abrirConta();
		
		c1.pagarMensal();
		
		Conta c2 = new Conta();
		c1.status();
		
		c1.depositar(tec.nextDouble());
		c1.sacar(tec.nextDouble());
		
	}

}
