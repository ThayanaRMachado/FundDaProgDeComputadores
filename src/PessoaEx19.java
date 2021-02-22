/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 95*/
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
				System.out.println("Classificação: A");
			} else if (peso >= 60 & peso <= 90) {
				System.out.println("Classificação: D");
			} else if (peso > 90) {
				System.out.println("Classificação: G");
			}
		} else if (altura >= 1.20 & altura <= 1.70) {
			if (peso < 60) {
				System.out.println("Classificação: B");
			} else if (peso >= 60 & peso <= 90) {
				System.out.println("Classificação: E");
			} else if (peso > 90) {
				System.out.println("Classificação: H");
			}
		} else if (altura >= 1.70) {
			if (peso < 60) {
				System.out.println("Classificação: C");
			} else if (peso >= 60 & peso <= 90) {
				System.out.println("Classificação: F");
			} else if (peso > 90) {
				System.out.println("Classificação: I");
			}
		}
	}
}
