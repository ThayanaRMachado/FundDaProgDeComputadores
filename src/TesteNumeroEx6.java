import java.util.Scanner;

public class TesteNumeroEx6 {

	public static void main(String[] args) {
		 
		NumeroEx6 numero = new NumeroEx6();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para saber se ele � par ou �mpar.");
		numero.setNum(entrada.nextInt());
		
		numero.calculaResto();
		numero.parOuImpar();

	}

}
