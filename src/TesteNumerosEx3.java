import java.util.Scanner;

public class TesteNumerosEx3 {

	public static void main(String[] args) {
		
		NumerosEx3 numeros = new NumerosEx3();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número.");
		numeros.setNum1(entrada.nextInt());
		
		System.out.println("Digite o segundo número.");
		numeros.setNum2(entrada.nextInt());
		
		numeros.calculaMaior();
		
	}
}
