import java.util.Scanner;

public class TesteNumeroEx7 {

	public static void main(String[] args) {
		
		NumeroEx7 numero = new NumeroEx7();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor para A.");
		numero.setA(entrada.nextInt());
		
		System.out.println("Digite um valor para B.");
		numero.setB(entrada.nextInt());
		
		System.out.println("Digite um valor para C.");
		numero.setC(entrada.nextInt());
		
		System.out.println("Digite um valor para I.");
		numero.setI(entrada.nextInt());
		
		numero.ordena();
	}
}
