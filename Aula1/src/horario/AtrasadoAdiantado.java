package horario;
import java.util.Scanner;

public class AtrasadoAdiantado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner (System.in);
		
		Horario h1 = new Horario();
		Horario h2 = new Horario();
		Horario h3 = new Horario();
		
		
			System.out.print("Digite a hora e o minuto da reunião: ");
			h1.hora = tec.nextInt();
			System.out.print(":");
			h1.minuto = tec.nextInt();
			System.out.println("Digite a hora e o minuto atual: ");
			h1.hora_atual = tec.nextInt();
			h1.minuto_atual = tec.nextInt();
			
			h1.atrasado();
		
	}

}
