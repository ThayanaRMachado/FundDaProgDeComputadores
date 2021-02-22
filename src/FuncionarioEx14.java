/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 91
14 - Faça um programa que receba o salário inicial de um funcionário, calcule e mostre o novo salário,
acrescido de bonificação e de auxílio escola.*/
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
			System.out.println("Novo Salário: R$" + calculaSalario());
		} else if (salarioIncial >= 500 & salarioIncial <= 1200){
			calculaBonificacao(12);
			System.out.println("Novo Salário: R$" + calculaSalario());
		}  else if (salarioIncial > 1200){
			System.out.println("Sem bonificação");
			System.out.println("Novo Salário: R$" + calculaSalario());
		}
	}
}
