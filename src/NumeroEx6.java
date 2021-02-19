//Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 79
//06 - Faça um programa que receba um número inteiro e verifique se é par ou ímpar.
public class NumeroEx6 {

	private int num, resto;

	public void setNum(int num) {
		this.num = num;
	}
	
	
	  public int calculaResto() { return resto = num % 2; }
	 
	
	public void  parOuImpar() {
		//resto = num % 2;
		if (resto == 0) {
			System.out.println("Número par.");
		}
		if (resto != 0) {
			System.out.println("Número ímpar.");
		}
	}
}
