import java.util.Scanner;

public class TesteAlunoEx1 {

	public static void main(String[] args) {
		
		AlunoEx1 aluno = new AlunoEx1();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota do trabalho de laborat�rio.");
		aluno.setTrabLab(entrada.nextDouble());
		
		System.out.println("Digite a nota da avalia��o semestral.");
		aluno.setAvalSem(entrada.nextDouble());
		
		System.out.println("Digite a nota da avalia��o final.");
		aluno.setExameFin(entrada.nextDouble());
		
		aluno.calculaMediaPond();
		
		aluno.classificaConceito(aluno.getMediaPond());
	}
}
