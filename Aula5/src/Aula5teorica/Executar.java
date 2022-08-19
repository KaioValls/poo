package Aula5teorica;

import java.util.Scanner;

public class Executar {

	public static void main(String[] args) {
	
		
		
		Conta c1 = new Conta();
		c1.setNumConta(1111);
		c1.setDono("João");
		c1.abrirConta("CC");
		
		Conta c2 = new Conta();
		c2.setNumConta(2222);
		c2.setDono("Cristina");
		c2.abrirConta("CP");
		
		c1.depositar(200);
		c2.depositar(500);
		c2.sacar(100);
		
		c1.sacar(250);
		c1.fecharConta();
		
		c1.status();
		c2.status();
		
		
		
	}

}
