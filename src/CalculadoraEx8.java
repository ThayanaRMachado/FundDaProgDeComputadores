//Fundamentos da programa��o de computadores - Cap�tulo 4 Estrutura condicional - p�gina 82
/*Fa�a um programa que mostre o menu de op��es a seguir, receba a op��o do usu�rio e os dados necess�rios
para executar cada opera��o.
Menu de op��es:
1. Somar dois n�meros.
2. Raiz quadrada de um n�mero.
Digite a op��o desejada:*/
public class CalculadoraEx8 {

	private double num1, num2, soma, raizQuadrada, opcao;

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double getOpcao() {
		return opcao;
	}

	public void setOpcao(double opcao) {
		this.opcao = opcao;
	}
	
	public double calculaSoma() {
		return soma = num1 + num2;
	}

	public double calculaRaizQuadrada(double num) {
		return raizQuadrada = Math.sqrt(num);
	}

	public void imprimirSoma() {
		System.out.println(num1 + " + " + num2 + " = " + soma);
	}
	
	public void imprimirRaizQuadrada() {
		System.out.println("Raiz quadrada de " + num1 + " = " + raizQuadrada);
	}
}
