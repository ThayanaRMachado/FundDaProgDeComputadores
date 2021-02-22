/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 91*/

public class FuncionarioEx15 {

	private double salarioMin, horasTrab, numDependentes, horasExtraTrab, salarioAReceber, valorHoraTrab, salarioMes, valorDependente,
	valorHExtra, salarioBruto, valorImposto, salarioLiquido, valorGratificacao;

	public void setSalarioMin(double salarioMin) {
		this.salarioMin = salarioMin;
	}

	public void setHorasTrab(double horasTrab) {
		this.horasTrab = horasTrab;
	}

	public void setNumDependentes(double numDependentes) {
		this.numDependentes = numDependentes;
	}

	public void setHorasExtraTrab(double horasExtraTrab) {
		this.horasExtraTrab = horasExtraTrab;
	}

	public void setSalarioAReceber(double salarioAReceber) {
		this.salarioAReceber = salarioAReceber;
	}
	
	public double calculaHoraTrab() {
		return valorHoraTrab = salarioMin * (1/5);
	}
	
	public double calculaSalarioMes() {
		return salarioMes = horasTrab * valorHoraTrab;
	}
	
	public double calculaValorDependente() {
		return valorDependente = numDependentes * 32;
	}
	
	public double calculaHoraExtraTrab() {
		return valorHExtra = horasExtraTrab * (horasTrab * (valorHoraTrab * (50/100)));
	}
	
	public double calculaSalBruto() {
		return salarioBruto = salarioMes + valorDependente + valorHExtra;
	}
	
	public void calculaImposto() {
		if (salarioBruto < 200	) {
			valorImposto = 0;
			System.out.println("Isento");
		} else if (salarioBruto >= 200 & salarioBruto <= 500){
			System.out.println(valorImposto = salarioBruto * (10/100));
		} else if (salarioBruto > 500){
			System.out.println(valorImposto = salarioBruto * (20/100));
		}
	}
	
	public double calculaSalarioLiq() {
		return salarioLiquido = salarioBruto - valorImposto;
	}
	
	public void calculaGratificacao() {
		if (salarioLiquido <= 350) {
			valorGratificacao = 100;
		} else if(salarioLiquido > 350) {
			valorGratificacao = 50;
		}
	}
	
	public double calculaSalarioAReceber() {
		 return salarioAReceber = salarioLiquido + valorGratificacao;
	}
}
