import java.util.Scanner;

public class TesteProdutoEx24 {

	public static void main(String[] args) {

		ProdutoEx24 produto = new ProdutoEx24();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o preço do produto.");
		produto.setPreco(entrada.nextDouble());

		System.out.println("Informe o tipo do produto: A — alimentação; L — limpeza; e V — vestuário");
		produto.setTipo(entrada.next().charAt(0));

		System.out.println(
				"Informe a refrigeração do produto: (S — produto que necessita de refrigeração; e N — produto que não necessita de refrigeração");
		produto.setRefrigeracao(entrada.next().charAt(0));

		produto.imprimir();

	}

}
