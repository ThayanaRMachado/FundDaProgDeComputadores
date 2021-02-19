import java.util.Scanner;

public class TesteCalendarioEx10 {

	public static void main(String[] args) {
		
		CalendarioEx10 calendario = new CalendarioEx10();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira data:");
		System.out.println("Dia:(dd)");
		calendario.setDia1(entrada.nextInt());
		
		System.out.println("Mês:(mm)");
		calendario.setMes1(entrada.nextInt());
		
		System.out.println("Ano:(aaaa)");
		calendario.setAno1(entrada.nextInt());
		
		System.out.println("Digite a segunda data:");
		System.out.println("Dia:(dd)");
		calendario.setDia2(entrada.nextInt());
		
		System.out.println("Mês:(mm)");
		calendario.setMes2(entrada.nextInt());
		
		System.out.println("Ano:(aaaa)");
		calendario.setAno2(entrada.nextInt());
		
		calendario.mostraMaiorData();
		
		
	}
}
