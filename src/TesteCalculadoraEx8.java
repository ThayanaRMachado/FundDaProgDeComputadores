import java.util.Scanner;

public class TesteCalculadoraEx8 {

	public static void main(String[] args) {

		CalculadoraEx8 calculadora = new CalculadoraEx8();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Menu de opções:");

		System.out.println("1 - Somar dois números");

		System.out.println("2 - Raiz quadrada de um número");

		System.out.println("Digite a sua opção:");
		calculadora.setOpcao(entrada.nextDouble());

		if (calculadora.getOpcao() == 1) {
			System.out.println("Digite o valor do 1º número.");
			calculadora.setNum1(entrada.nextDouble());

			System.out.println("Digite o valor do 2º número.");
			calculadora.setNum2(entrada.nextDouble());

			calculadora.calculaSoma();
			calculadora.imprimirSoma();
		}
		if (calculadora.getOpcao() == 2) {
			System.out.println("Digite o valor do número.");
			calculadora.setNum1(entrada.nextDouble());

			calculadora.calculaRaizQuadrada(calculadora.getNum1());
			calculadora.imprimirRaizQuadrada();
		}
		if ((calculadora.getOpcao() != 1) && (calculadora.getOpcao() != 2)) {
			System.out.println("Opção inválida.");
		}

	}

}
