import java.util.Scanner;

public class TesteNumerosEx5 {

	public static void main(String[] args) {
		
		NumerosEx5 numeros = new NumerosEx5();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 3 n�meros em ordem crescente.");
		numeros.setNum1(entrada.nextInt());
		numeros.setNum2(entrada.nextInt());
		numeros.setNum3(entrada.nextInt());
		
		System.out.println("Digite o 4� n�mero aleat�rio.");
		numeros.setNum4(entrada.nextInt());
		
		numeros.ordenaDecrescente();
	}

}
