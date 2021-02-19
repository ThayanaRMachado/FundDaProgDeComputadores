import java.util.Scanner;

public class TesteHoraEx11 {

	public static void main(String[] args) {
		
		HoraEx11 hora = new HoraEx11();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o horário inicial:");
		System.out.println("Hora:");
		hora.setHoraInicial(entrada.nextInt());

		System.out.println("Minuto:");
		hora.setMinInicial(entrada.nextInt());
		
		System.out.println("Digite o horário final:");
		System.out.println("Hora:");
		hora.setHoraFinal(entrada.nextInt());
		
		System.out.println("Hora:");
		hora.setMinFinal(entrada.nextInt());
		
		hora.transformaHora();
		hora.transformaMinuto();
		hora.calculaTempo();
		hora.imprimir();
	}

}
