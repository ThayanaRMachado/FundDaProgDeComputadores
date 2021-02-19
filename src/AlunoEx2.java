/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 77
02 -Faça um programa que receba três notas de um aluno, calcule e mostre a média aritmética e a mensagem
constante na tabela a seguir. Aos alunos que ficaram para exame, calcule e mostre a nota que deverão
tirar para serem aprovados, considerando que a média exigida é 6,0.*/
public class AlunoEx2 {

	private double nota1, nota2, nota3, mediaAritm, notaExame;

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getMediaAritm() {
		return mediaAritm;
	}

	public double calculaMedia() {
		return mediaAritm = (nota1 + nota2 + nota3) / 3;
	}

	public double calculaNotaExame() {
		return notaExame = 12 - mediaAritm;
	}
	
	public void imprimir(double media) {
		if (media >= 0 & media < 3) {
			System.out.println("Média aritmética: " + media);
			System.out.println("Reprovado");
		}
		if (media >= 3 & media < 7) {
			System.out.println("Média aritmética: " + media);
			System.out.println("Exame");
			System.out.println("Para ser aprovado, você deverá tirar a nota " + calculaNotaExame() + "no exame.");
		}
		if (media >= 7 & media <= 10) {
			System.out.println("Média aritmética: " + media);
			System.out.println("Aprovado");
		}
	}
}
