import java.util.Scanner;

public class TesteFuncionarioEx12 {

	public static void main(String[] args) {
		
		FuncionarioEx12 funcionario = new FuncionarioEx12();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o cargo do funcion�rio: (1, 2, 3, 4 ou 5)");
		funcionario.setCodigo(entrada.nextInt());
		
		System.out.println("Digite o valor do sal�rio.");
		funcionario.setSalarioAtual(entrada.nextInt());
		
		funcionario.menu();
	}
}
