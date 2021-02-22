import java.util.Scanner;

public class TesteFuncionarioEx13 {

	public static void main(String[] args) {
		
		FuncionarioEx13 funcionario = new FuncionarioEx13();
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Digite a opção desejada. (1- Imposto 2- Novo Salário 3-Classificação");
		funcionario.setCodigo(entrada.nextInt());
		
		System.out.println("Digite o valor do salário.");
		funcionario.setSalario(entrada.nextDouble());
		
		funcionario.menu();
	}
}
