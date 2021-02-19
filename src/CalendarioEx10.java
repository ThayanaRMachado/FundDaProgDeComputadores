/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 85
10 - Faça um programa que determine a data cronologicamente maior entre duas datas fornecidas pelo usuário. 
Cada data deve ser composta por três valores inteiros, em que o primeiro representa o dia, o
segundo, o mês e o terceiro, o ano.*/

public class CalendarioEx10 {

	private int dia1, mes1, ano1, dia2, mes2, ano2;

	public void setDia1(int dia1) {
		this.dia1 = dia1;
	}

	public void setMes1(int mes1) {
		this.mes1 = mes1;
	}

	public void setAno1(int ano1) {
		this.ano1 = ano1;
	}

	public void setDia2(int dia2) {
		this.dia2 = dia2;
	}

	public void setMes2(int mes2) {
		this.mes2 = mes2;
	}

	public void setAno2(int ano2) {
		this.ano2 = ano2;
	}

	public void mostraMaiorData() {
		if (ano1 > ano2) {
			System.out.println("A maior data é: " + dia1 + "/" + mes1 + "/" + ano1);
		} else if (ano2 > ano1) {
			System.out.println("A maior data é: " + dia2 + "/" + mes2 + "/" + ano2);
		} else if (mes1 > mes2) {
			System.out.println("A maior data é: " + dia1 + "/" + mes1 + "/" + ano1);
		} else if (mes2 > mes1) {
			System.out.println("A maior data é: " + dia2 + "/" + mes2 + "/" + ano2);
		} else if (dia1 > dia2) {
			System.out.println("A maior data é: " + dia1 + "/" + mes1 + "/" + ano1);
		} else if (dia2 > dia1) {
			System.out.println("A maior data é: " + dia2 + "/" + mes2 + "/" + ano2);
		} else {
			System.out.println("As datas são iguais.");
		}
	}

}
