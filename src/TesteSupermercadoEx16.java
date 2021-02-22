import java.util.Scanner;

public class TesteSupermercadoEx16 {

	public static void main(String[] args) {
		
		SupermercadoEx16 supermercado = new SupermercadoEx16();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o preço atual do produto.");
		supermercado.setPrecoAtual(entrada.nextDouble());

		System.out.println("Informe a venda média mensal do produto.");
		supermercado.setPrecoAtual(entrada.nextDouble());
		
		supermercado.imprimir();
	}

}
