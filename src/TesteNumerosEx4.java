import java.util.Scanner;

public class TesteNumerosEx4 {

	public static void main(String[] args) {
		
		NumerosEx4 numeros = new NumerosEx4();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero.");
		numeros.setNum1(entrada.nextInt());
		
		System.out.println("Digite o 2� n�mero.");
		numeros.setNum2(entrada.nextInt());
		
		System.out.println("Digite o 3� n�mero.");
		numeros.setNum3(entrada.nextInt());
		
		numeros.ordenaCrescente();
	}
}
