import java.util.Scanner;

public class TesteFuncionarioEx22 {

	public static void main(String[] args) {
		
		FuncionarioEx22 funcionario = new FuncionarioEx22();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor do salário base.");
		funcionario.setSalarioBase(entrada.nextDouble());
		
		System.out.println("Informe o tempo de serviço.");
		funcionario.setTempoServico(entrada.nextInt());
		
		funcionario.calculaImposto();
		funcionario.calculaGratificacao();
		funcionario.calculaSalarioLiq();
		
		funcionario.imprimir();
	}

}
