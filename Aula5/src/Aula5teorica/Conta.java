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
	
	public void abrirConta(String c) {
		this.setTipo(c);
		this.setStatus(true);	
		if (this.getTipo().equalsIgnoreCase("cc")) {
			this.setSaldo(50);	
		}else if(this.getTipo().equalsIgnoreCase("cp")) {
			this.setSaldo(150);
		}
		System.out.println("Conta de "+ this.getDono()+" aberta.");
	}
	
	public void fecharConta() {
		if(this.getSaldo()!=0) {
			System.out.println("Você não pode deletar sua conta!\nSaque ou pague o que  está pendente.");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso.");
		}
					
	}
	
	public void depositar(double d) {
		
		if(this.getStatus()==true) {
				this.setSaldo(this.getSaldo()+d);
				System.out.println("Depósito realizado na contas de "+ this.getDono());
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
		return this.numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getDono() {
		return this.dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void status() {
		System.out.println("------------------------------");
		System.out.println("Numero da conta: "+this.getNumConta());
		System.out.println("tipo: "+this.getTipo());
		System.out.println("Dono: "+this.getDono());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.getStatus());
	}
	
}
