//Fundamentos da programa��o de computadores - Cap�tulo 4 Estrutura condicional - p�gina 79
//06 - Fa�a um programa que receba um n�mero inteiro e verifique se � par ou �mpar.
public class NumeroEx6 {

	private int num, resto;

	public void setNum(int num) {
		this.num = num;
	}
	
	
	  public int calculaResto() { return resto = num % 2; }
	 
	
	public void  parOuImpar() {
		//resto = num % 2;
		if (resto == 0) {
			System.out.println("N�mero par.");
		}
		if (resto != 0) {
			System.out.println("N�mero �mpar.");
		}
	}
}
