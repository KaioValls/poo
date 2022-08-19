package Aula5teorica;

import java.util.Scanner;

public class Conta {
	Scanner tec = new Scanner (System.in);
	
	public int numConta;
	protected String tipo; //cc ou cp
	private String dono;
	private double saldo;
	private boolean status;
	
	public Conta() {
		this.setStatus(false);
		this.setSaldo(0);
	}
	
	public void abrirConta() {
		this.setStatus(true);	
		do {
			System.out.println("Conta corrente (digite cc) ou Conta Poupança (digite cp)");
			this.setTipo(tipo);
		} while ( !tipo.equalsIgnoreCase("CC") && !tipo.equalsIgnoreCase("CP"));
		if (this.getTipo().equalsIgnoreCase("cc")) {
			this.setSaldo(saldo+=50);	
		}else if(this.getTipo().equalsIgnoreCase("cp")) {
			this.setSaldo(saldo+=150);
		}
	}
	
	public void fecharConta() {
		if(this.getSaldo()!=0) {
			System.out.println("Você não pode deletar sua conta!\n Saque ou pague o que  está pendente.");
		}else this.setStatus(false);
					
	}
	
	public void depositar(double d) {
		
		if(this.getStatus()==true) {
				this.setSaldo(this.getSaldo()+d);
		}else System.out.println("Você precisa abrir sua conta!");
	}
	
	public void sacar(double d) {
		if (this.getStatus()==true) {
				if (d>this.getSaldo()) {
					
					System.out.println("você não pode sacar mais que R$"+this.getSaldo());
				}else {
					this.setSaldo(this.getSaldo()-d);
				}
	
		}else System.out.println("Impossível sacar");
	}
	public void pagarMensal() {
		int v;
		if(this.getTipo().equalsIgnoreCase("cc")) {
			v=12;
		}else {
			this.getTipo().equalsIgnoreCase("cp");
			v=20;
		}
		if(this.getStatus()==true && this.getSaldo()>v) {
			this.setSaldo(this.getSaldo()-v);
		}else System.out.println("Saldo insuficiente ou conta fechada");
			
		
	}
	
	
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		t = tec.next();
		this.tipo = t;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void status() {
		System.out.println("Numero da conta: "+this.getNumConta());
		System.out.println("tipo: "+this.getTipo().toUpperCase());
		System.out.println("Dono: "+this.getDono());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.getStatus());
	}
	
}
