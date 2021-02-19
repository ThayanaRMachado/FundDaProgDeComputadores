import java.util.Scanner;

public class TesteNumeroEx6 {

	public static void main(String[] args) {
		 
		NumeroEx6 numero = new NumeroEx6();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se ele é par ou ímpar.");
		numero.setNum(entrada.nextInt());
		
		numero.calculaResto();
		numero.parOuImpar();

	}

}
