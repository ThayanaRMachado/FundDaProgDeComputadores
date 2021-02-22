import java.util.Scanner;

public class TesteProdutoEx20 {

	public static void main(String[] args) {
		
		ProdutoEx20 produto = new ProdutoEx20();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o código do produto (De 1 a 10).");
		produto.setCodigo(entrada.nextInt());
		
		System.out.println("Informe o peso em Kg.");
		produto.setPesoKg(entrada.nextDouble());
		
		System.out.println("Informe o código do país de origem do produto (De 1 a 3).");
		produto.setCodigo(entrada.nextInt());
		
		produto.calculaPrecoPorGr();
		produto.imprimir();
	}
}
