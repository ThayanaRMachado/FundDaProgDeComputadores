//Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 79
//04 - Faça um programa que receba três números e mostre-os em ordem crescente. Suponha que o usuário
//digitará três números diferentes.
public class NumerosEx4 {

	private int num1, num2, num3;

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	public void ordenaCrescente() {
		if (num1 < num2 & num1 < num3) {
			if (num2 < num3) {
				System.out.println("A ordem crescente é: " + num1+ "-" +num2+ "-" +num3);
			} else {
				System.out.println("A ordem crescente é: " + num1+ "-" +num3+ "-" +num2);
			}
		}
		if (num2 < num1 & num2 < num3) {
			if (num1 < num3) {
				System.out.println("A ordem crescente é: " + num2+ "-" +num1+ "-" +num3);
			} else {
				System.out.println("A ordem crescente é: " + num2+ "-" +num3+ "-" +num1);
			}
		}
		if (num3 < num1 & num3 < num2) {
			if (num1 < num2) {
				System.out.println("A ordem crescente é: " + num3+ "-" +num1+ "-" +num2);
			} else {
				System.out.println("A ordem crescente é: " + num3+ "-" +num2+ "-" +num1);
			}
		}
	}
	
}
