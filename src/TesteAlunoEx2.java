import java.util.Scanner;

public class TesteAlunoEx2 {

	public static void main(String[] args) {
		
		AlunoEx2 aluno = new AlunoEx2();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota.");
		aluno.setNota1(entrada.nextDouble());
		
		System.out.println("Digite a segunda nota.");
		aluno.setNota2(entrada.nextDouble());
		
		System.out.println("Digite a terceira nota.");
		aluno.setNota3(entrada.nextDouble());
		
		aluno.calculaMedia();
		
		aluno.imprimir(aluno.getMediaAritm());
	}
}
