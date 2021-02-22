/*Fundamentos da programa��o de computadores - Cap�tulo 4 Estrutura condicional - p�gina 91
14 - Fa�a um programa que receba o sal�rio inicial de um funcion�rio, calcule e mostre o novo sal�rio,
acrescido de bonifica��o e de aux�lio escola.*/
public class FuncionarioEx14 {

	private double salarioIncial, novoSalario, percentualBonificacao, bonificacao, auxilioEscola;

	public void setSalarioIncial(double salarioIncial) {
		this.salarioIncial = salarioIncial;
	}
	
	public double calculaBonificacao(double percentualBonificacao) {
		return bonificacao = salarioIncial * (percentualBonificacao/100);
	}
	
	public double calculaAuxilioEscola() {
		if (salarioIncial <= 600) {
			return auxilioEscola = 150;
		} else {
			return auxilioEscola = 100;
		}
	}
	
	public double calculaSalario() {
		return novoSalario = salarioIncial + bonificacao + auxilioEscola;
	}
	
	public void menu() {
		calculaAuxilioEscola();
		if (salarioIncial < 500) {
			calculaBonificacao(5);
			System.out.println("Novo Sal�rio: R$" + calculaSalario());
		} else if (salarioIncial >= 500 & salarioIncial <= 1200){
			calculaBonificacao(12);
			System.out.println("Novo Sal�rio: R$" + calculaSalario());
		}  else if (salarioIncial > 1200){
			System.out.println("Sem bonifica��o");
			System.out.println("Novo Sal�rio: R$" + calculaSalario());
		}
	}
}
