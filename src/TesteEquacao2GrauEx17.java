import java.util.Scanner;

public class TesteEquacao2GrauEx17 {

	public static void main(String[] args) {
		Equacao2GrauEx17 equacao = new Equacao2GrauEx17();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor de a.");
		equacao.setA(entrada.nextDouble());
		
		System.out.println("Informe o valor de b.");
		equacao.setB(entrada.nextDouble());
		
		System.out.println("Informe o valor de c.");
		equacao.setC(entrada.nextDouble());
		
		equacao.calcula();
	}
}
