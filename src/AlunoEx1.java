/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 76
A nota final de um estudante é calculada a partir de três notas atribuídas, respectivamente, a um trabalho
de laboratório, a uma avaliação semestral e a um exame final. 
A média das três notas mencionadas obedece aos pesos a seguir:
Faça um programa que receba as três notas, calcule e mostre a média ponderada e o conceito que segue a tabela:*/
public class AlunoEx1 {

	private double trabLab, avalSem, exameFin, mediaPond;

	public void setTrabLab(double trabLab) {
		this.trabLab = trabLab;
	}

	public void setAvalSem(double avalSem) {
		this.avalSem = avalSem;
	}

	public void setExameFin(double exameFin) {
		this.exameFin = exameFin;
	}
	
	public double getMediaPond() {
		return mediaPond;
	}

	public double calculaMediaPond() {
		return mediaPond = ((trabLab * 2) + (avalSem * 3) + (exameFin * 5)) / (2 + 3 + 5);
	}

	public void classificaConceito(double mediaPond) {
		
		if (mediaPond >= 8 & mediaPond <= 10) {
			System.out.println("Obteve conceito A");
		}
		if (mediaPond >= 7 & mediaPond < 8) {
			System.out.println("Obteve conceito B");
		}
		if (mediaPond >= 6 & mediaPond < 7) {
			System.out.println("Obteve conceito C");
		}
		if (mediaPond >= 5 & mediaPond < 6) {
			System.out.println("Obteve conceito D");
		}
		if (mediaPond >= 0 & mediaPond < 5) {
			System.out.println("Obteve conceito E");
		}
	}
}
