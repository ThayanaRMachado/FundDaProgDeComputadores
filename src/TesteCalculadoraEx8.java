import java.util.Scanner;

public class TesteCalculadoraEx8 {

	public static void main(String[] args) {

		CalculadoraEx8 calculadora = new CalculadoraEx8();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Menu de op��es:");

		System.out.println("1 - Somar dois n�meros");

		System.out.println("2 - Raiz quadrada de um n�mero");

		System.out.println("Digite a sua op��o:");
		calculadora.setOpcao(entrada.nextDouble());

		if (calculadora.getOpcao() == 1) {
			System.out.println("Digite o valor do 1� n�mero.");
			calculadora.setNum1(entrada.nextDouble());

			System.out.println("Digite o valor do 2� n�mero.");
			calculadora.setNum2(entrada.nextDouble());

			calculadora.calculaSoma();
			calculadora.imprimirSoma();
		}
		if (calculadora.getOpcao() == 2) {
			System.out.println("Digite o valor do n�mero.");
			calculadora.setNum1(entrada.nextDouble());

			calculadora.calculaRaizQuadrada(calculadora.getNum1());
			calculadora.imprimirRaizQuadrada();
		}
		if ((calculadora.getOpcao() != 1) && (calculadora.getOpcao() != 2)) {
			System.out.println("Op��o inv�lida.");
		}

	}

}
