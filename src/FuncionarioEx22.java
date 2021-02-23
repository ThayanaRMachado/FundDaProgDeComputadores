/*Fundamentos da programa��o de computadores - Cap�tulo 4 Estrutura condicional - p�gina 99*/
public class FuncionarioEx22 {

	private double salarioBase, valorImposto, valorGratificacao, salarioLiquido;
	private int tempoServico;

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}
	
	public double calculaImposto() {
		if (salarioBase < 200) {
			valorImposto = 0;
			System.out.println("Isento de Imposto");
		} else
		if (salarioBase <= 450) {
			valorImposto = salarioBase * 0.03;
		} else
		if (salarioBase < 700) {
			valorImposto = salarioBase * 0.08;
		} else
		if (salarioBase >= 700) {
			valorImposto = salarioBase * 0.12;
		}
		return valorImposto;
	}
	
	public double calculaGratificacao() {
		if (salarioBase > 500) {
			if (tempoServico <= 3) {
				valorGratificacao = 20;
			} else {
				valorGratificacao = 30;
			}
		}
		if(salarioBase < 500) {
			if (tempoServico <= 3) {
				valorGratificacao = 23;
			} else if(tempoServico < 6) {
				valorGratificacao = 35;
			} else {
				valorGratificacao = 33;
			}
		}
		return valorGratificacao;
	}
	
	public double calculaSalarioLiq() {
		return salarioLiquido = salarioBase - valorImposto + valorGratificacao;
	}
	
	public void categorizar() {
		if (salarioBase <= 350) {
			System.out.println("Classifica��o A");
		} else if(salarioBase < 600) {
			System.out.println("Classifica��o B");
		} else {
			System.out.println("Classifica��o C");
		}
	}
	
	public void imprimir() {
		System.out.println("Imposto: R$" + calculaImposto());
		System.out.println("Gratifica��o: R$" + calculaGratificacao());
		System.out.println("Sal�rio L�quido: R$" + calculaSalarioLiq());
		categorizar();
	}

}
