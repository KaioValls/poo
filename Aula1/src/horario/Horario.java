package horario;

public class Horario {
	
	int hora;
	int minuto;
	int hora_atual;
	int minuto_atual;
	
	void atrasado() {
		if (hora==hora_atual && minuto==minuto_atual) {
			System.out.println("Voc� est� no horar�o " + this.hora+":"+this.minuto);
		}else if (hora<=hora_atual && minuto<minuto_atual) {
			System.out.println("Voc� esta adiantado!");
		}else System.out.println("Voc� est� atrasado :(");
	}
	
}
