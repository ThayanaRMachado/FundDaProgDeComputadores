import java.util.Scanner;

public class TesteFuncionarioEx13 {

	public static void main(String[] args) {
		
		FuncionarioEx13 funcionario = new FuncionarioEx13();
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Digite a op��o desejada. (1- Imposto 2- Novo Sal�rio 3-Classifica��o");
		funcionario.setCodigo(entrada.nextInt());
		
		System.out.println("Digite o valor do sal�rio.");
		funcionario.setSalario(entrada.nextDouble());
		
		funcionario.menu();
	}
}
