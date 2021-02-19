/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 78
03 - Faça um programa que receba dois números e mostre o maior.*/
public class NumerosEx3 {

	private int num1, num2;

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void calculaMaior() {
		if (num1 > num2) {
			System.out.println("O maior número é " + num1 + ".");
		} 
		if (num1 < num2) {
			System.out.println("O maior número é " + num2 + ".");
		} else {
			System.out.println("Os números são iguais.");
		}
	}
}
