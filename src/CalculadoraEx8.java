//Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 82
/*Faça um programa que mostre o menu de opções a seguir, receba a opção do usuário e os dados necessários
para executar cada operação.
Menu de opções:
1. Somar dois números.
2. Raiz quadrada de um número.
Digite a opção desejada:*/
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
