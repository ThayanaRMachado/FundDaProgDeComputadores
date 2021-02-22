/*Fundamentos da programa��o de computadores - Cap�tulo 4 Estrutura condicional - p�gina 95*/
public class PessoaEx19 {

	private double altura, peso;

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void classifica() {
		if (altura < 1.20) {
			if (peso < 60) {
				System.out.println("Classifica��o: A");
			} else if (peso >= 60 & peso <= 90) {
				System.out.println("Classifica��o: D");
			} else if (peso > 90) {
				System.out.println("Classifica��o: G");
			}
		} else if (altura >= 1.20 & altura <= 1.70) {
			if (peso < 60) {
				System.out.println("Classifica��o: B");
			} else if (peso >= 60 & peso <= 90) {
				System.out.println("Classifica��o: E");
			} else if (peso > 90) {
				System.out.println("Classifica��o: H");
			}
		} else if (altura >= 1.70) {
			if (peso < 60) {
				System.out.println("Classifica��o: C");
			} else if (peso >= 60 & peso <= 90) {
				System.out.println("Classifica��o: F");
			} else if (peso > 90) {
				System.out.println("Classifica��o: I");
			}
		}
	}
}
