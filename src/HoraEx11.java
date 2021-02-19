/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 86
Faça um programa que receba a hora do início de um jogo e a hora do término (cada hora é composta
por duas variáveis inteiras: hora e minuto). Calcule e mostre a duração do jogo (horas e minutos),
sabendo que o tempo máximo de duração do jogo é de 24 horas e que ele pode começar em um dia e
terminar no dia seguinte.*/

public class HoraEx11 {

	private int horaInicial, horaFinal, minInicial, minFinal, horaDuracao, minDuracao;

	public void setHoraInicial(int horaInicial) {
		this.horaInicial = horaInicial;
	}

	public void setHoraFinal(int horaFinal) {
		this.horaFinal = horaFinal;
	}

	public void setMinInicial(int minInicial) {
		this.minInicial = minInicial;
	}

	public void setMinFinal(int minFinal) {
		this.minFinal = minFinal;
	}
	
	public void transformaMinuto() {
		if (minInicial > minFinal) {
			minFinal = minFinal + 60;
			horaFinal = horaFinal - 1;
		}
	}
	
	public void transformaHora() {
		if (horaInicial > horaFinal) {
			horaFinal = horaFinal + 24;
		}
	}
	
	public void calculaTempo() {
		minDuracao = minFinal - minInicial;
		horaDuracao = horaFinal - horaInicial;
	}
	
	public void imprimir() {
		System.out.println("O jogo durou " + horaDuracao + " hora(s) e " +minDuracao + "minuto(s)");
	}
	
}
