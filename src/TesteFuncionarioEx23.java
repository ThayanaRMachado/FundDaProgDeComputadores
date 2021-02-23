import java.util.Scanner;

public class TesteFuncionarioEx23 {

	public static void main(String[] args) {
		
		FuncionarioEx23 funcionario = new FuncionarioEx23();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor do Salário Base");
		funcionario.setSalarioMin(entrada.nextDouble());
		
		System.out.println("Informe o turno de trabalho: (M): Matutino, (V): Vespertino, (N): Noturno");
		funcionario.setTurno(entrada.next().charAt(0));
		
		System.out.println("Informe a sua Categoria: (O): Operário, (G): Gerente");
		funcionario.setCategoria(entrada.next().charAt(0));
		
		System.out.println("Informe o número de horas trabalhadas");
		funcionario.setHorasTrab(entrada.nextInt());
		
		System.out.println("Coeficiente do Salário: R$" + funcionario.calculaCoefSalario());
		System.out.println("Salário Bruto: R$" + funcionario.calculaSalarioBruto());
		System.out.println("Imposto: R$" + funcionario.calculaImposto());
		System.out.println("Gratificação: R$" + funcionario.gratificacao());
		System.out.println("Salário Líquido: R$" + funcionario.calculaSalarioLiq());
		funcionario.classifica();
	}

}
