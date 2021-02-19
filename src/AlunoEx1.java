/*Fundamentos da programa��o de computadores - Cap�tulo 4 Estrutura condicional - p�gina 76
A nota final de um estudante � calculada a partir de tr�s notas atribu�das, respectivamente, a um trabalho
de laborat�rio, a uma avalia��o semestral e a um exame final. 
A m�dia das tr�s notas mencionadas obedece aos pesos a seguir:
Fa�a um programa que receba as tr�s notas, calcule e mostre a m�dia ponderada e o conceito que segue a tabela:*/
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
