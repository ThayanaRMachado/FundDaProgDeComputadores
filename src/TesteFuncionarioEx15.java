import java.util.Scanner;

public class TesteFuncionarioEx15 {

	public static void main(String[] args) {
		FuncionarioEx15 funcionario = new FuncionarioEx15();
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor do salário mínimo.");
		funcionario.setSalarioMin(entrada.nextDouble());
		
		System.out.println("Informe o número de horas trabalhadas.");
		funcionario.setHorasTrab(entrada.nextDouble());
		
		System.out.println("Informe o número de dependentes do funcionário.");
		funcionario.setNumDependentes(entrada.nextDouble());
		
		System.out.println("Informe a quantidade de horas extras trabalhadas.");
		funcionario.setHorasExtraTrab(entrada.nextDouble());
		
		funcionario.calculaHoraTrab();
		funcionario.calculaSalarioMes();
		funcionario.calculaValorDependente();
		funcionario.calculaHoraExtraTrab();
		funcionario.calculaSalBruto();
		funcionario.calculaImposto();
		funcionario.calculaSalarioLiq();
		funcionario.calculaGratificacao();
		System.out.println("Salário a receber: R$" +funcionario.calculaSalarioAReceber());;
	}

}
