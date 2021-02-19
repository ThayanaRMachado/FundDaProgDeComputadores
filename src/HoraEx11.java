/*Fundamentos da programa��o de computadores - Cap�tulo 4 Estrutura condicional - p�gina 86
Fa�a um programa que receba a hora do in�cio de um jogo e a hora do t�rmino (cada hora � composta
por duas vari�veis inteiras: hora e minuto). Calcule e mostre a dura��o do jogo (horas e minutos),
sabendo que o tempo m�ximo de dura��o do jogo � de 24 horas e que ele pode come�ar em um dia e
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
