/*Fundamentos da programa��o de computadores - Cap�tulo 4 Estrutura condicional - p�gina 78
03 - Fa�a um programa que receba dois n�meros e mostre o maior.*/
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
			System.out.println("O maior n�mero � " + num1 + ".");
		} 
		if (num1 < num2) {
			System.out.println("O maior n�mero � " + num2 + ".");
		} else {
			System.out.println("Os n�meros s�o iguais.");
		}
	}
}
