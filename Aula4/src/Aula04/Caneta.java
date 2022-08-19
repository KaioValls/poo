package Aula04;

public class Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	private boolean tampada;

	public  Caneta(String m, String c, float p){ //metodo construtor
		this.setModelo(m);
		this.setCor(c);
		this.setPonta(p);
		this.tampar();
		
	}
	
	
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setCor(String c) {
		this.cor = c;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	
	public boolean getTampada() {
		return tampada;
	}
	
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	public void status() {
		System.out.println("SOBRE A CANETA:");
		System.out.println("Modelo:" + this.getModelo());
		System.out.println("Ponta:" + this.getPonta());
		System.out.println("Cor:" + this.getCor());
		System.out.println("Tampada:" + this.getTampada());
	}
}
