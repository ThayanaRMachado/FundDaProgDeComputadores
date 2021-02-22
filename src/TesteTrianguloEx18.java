import java.util.Scanner;

public class TesteTrianguloEx18 {

	public static void main(String[] args) {
		
		TrianguloEx18 triangulo = new TrianguloEx18();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor de a.");
		triangulo.setX(entrada.nextInt());
		
		System.out.println("Informe o valor de b.");
		triangulo.setY(entrada.nextInt());
		
		System.out.println("Informe o valor de c.");
		triangulo.setZ(entrada.nextInt());
		
		triangulo.classificaTriangulo();

	}

}
