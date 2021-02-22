import java.util.Scanner;

public class TesteFuncionarioEx14 {

	public static void main(String[] args) {

		FuncionarioEx14 funcionario = new FuncionarioEx14();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário atual.");
		funcionario.setSalarioIncial(entrada.nextDouble());
		
		funcionario.menu();

	}

}
