/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 100*/
public class FuncionarioEx23 {

	private double salarioMin, coefSalario, salarioBruto, imposto, gratificacao, auxilioAlim, salarioLiq;
	private int horasTrab;
	private char turno, categoria;

	public void setSalarioMin(double salarioMin) {
		this.salarioMin = salarioMin;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	public void setHorasTrab(int horasTrab) {
		this.horasTrab = horasTrab;
	}
	
	public double calculaCoefSalario() {
		if (turno == 'M') {
			coefSalario = salarioMin * 0.1;
		}
		if (turno == 'V') {
			coefSalario = salarioMin * 0.15;
		}
		if (turno == 'N') {
			coefSalario = salarioMin * 0.12;
		}
		return coefSalario;
	}
	
	public double calculaSalarioBruto() {
		return salarioBruto = horasTrab * coefSalario;
	}
	
	public double calculaImposto() {
		if (categoria == 'O') {
			if (salarioBruto >= 300) {
				imposto = salarioBruto * 0.05;
			} else {
				imposto = salarioBruto * 0.03;
			}
		}
		if (categoria == 'G') {
			if (salarioBruto >= 400) {
				imposto = salarioBruto * 0.06;
			} else {
				imposto = salarioBruto * 0.04;
			}
		}
		return imposto;
	}
	
	public double gratificacao() {
		if (turno == 'N' && horasTrab > 80) {
			gratificacao = 50;
		} else {
			gratificacao = 30;
		}
		return gratificacao;
	}
	
	public double auxilioAlim() {
		if (categoria == 'O' || coefSalario <= 25) {
			auxilioAlim = salarioBruto * (1/3);
		} else {
			auxilioAlim = salarioBruto * (1/2);
		}
		return auxilioAlim;
	}
	
	public double calculaSalarioLiq() {
		return salarioLiq = salarioBruto - imposto + gratificacao + auxilioAlim;
	}
	
	public void classifica() {
		if (salarioLiq < 350) {
			System.out.println("Mal remunerado");
		}
		if(salarioLiq <= 600) {
			System.out.println("Normal");
		}
		if(salarioLiq > 600) {
			System.out.println("Bem remunerado");
		}
	}
}
