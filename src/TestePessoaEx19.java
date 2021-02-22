import java.util.Scanner;
//Testar colocando a altura com ",".
public class TestePessoaEx19 {

	public static void main(String[] args) {
		PessoaEx19 pessoa = new PessoaEx19();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a altura.");
		pessoa.setAltura(entrada.nextDouble());
		
		System.out.println("Informe o peso.");
		pessoa.setPeso(entrada.nextDouble());
		
		pessoa.classifica();
	}
}
