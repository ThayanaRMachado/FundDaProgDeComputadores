/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 79
05 - Faça um programa que receba três números obrigatoriamente em ordem crescente e um quarto número que não siga essa regra. 
Mostre, em seguida, os quatro números em ordem decrescente. Suponha que o usuário digitará quatro números diferentes.*/
public class NumerosEx5 {

	private int num1, num2, num3, num4;

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public void setNum4(int num4) {
		this.num4 = num4;
	}

	public void ordenaDecrescente() {
		if (num4 > num3) {
			System.out.println("A ordem decrescente é: " + num4 + "-" + num3 + "-" + num2 + "-" + num1);
		}
		if (num4 > num2 && num4 < num3) {
			System.out.println("A ordem decrescente é: " + num3 + "-" + num4 + "-" + num2 + "-" + num1);
		}
		if (num4 > num1 && num4 < num2) {
			System.out.println("A ordem decrescente é: " + num3 + "-" + num2 + "-" + num4 + "-" + num1);
		}
		if (num4 < num1) {
			System.out.println("A ordem decrescente é: " + num3 + "-" + num2 + "-" + num1 + "-" + num4);
		}
	}
}
