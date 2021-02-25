import java.util.Scanner;

public class TesteTrigonometriaEx25 {

	public static void main(String[] args) {
		
		TrigonometriaEx25 trigonometria = new TrigonometriaEx25();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a medida de um ângulo em graus.");
		trigonometria.setAngulo(entrada.nextInt());

		trigonometria.imprimir();
	}

}
