import java.util.Scanner;

public class TesteProdutoEx24 {

	public static void main(String[] args) {

		ProdutoEx24 produto = new ProdutoEx24();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o pre�o do produto.");
		produto.setPreco(entrada.nextDouble());

		System.out.println("Informe o tipo do produto: A � alimenta��o; L � limpeza; e V � vestu�rio");
		produto.setTipo(entrada.next().charAt(0));

		System.out.println(
				"Informe a refrigera��o do produto: (S � produto que necessita de refrigera��o; e N � produto que n�o necessita de refrigera��o");
		produto.setRefrigeracao(entrada.next().charAt(0));

		produto.imprimir();

	}

}
