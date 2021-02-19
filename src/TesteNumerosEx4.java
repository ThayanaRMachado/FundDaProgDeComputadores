import java.util.Scanner;

public class TesteNumerosEx4 {

	public static void main(String[] args) {
		
		NumerosEx4 numeros = new NumerosEx4();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o 1º número.");
		numeros.setNum1(entrada.nextInt());
		
		System.out.println("Digite o 2º número.");
		numeros.setNum2(entrada.nextInt());
		
		System.out.println("Digite o 3º número.");
		numeros.setNum3(entrada.nextInt());
		
		numeros.ordenaCrescente();
	}
}
