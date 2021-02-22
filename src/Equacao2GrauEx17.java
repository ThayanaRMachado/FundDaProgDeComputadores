/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 93*/
public class Equacao2GrauEx17 {

	private double a, b, c, delta, x1, x2;

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}

	public void calcula() {
		if (a == 0) {
			System.out.println("Estes valores não formam uma equação do 2º grau.");
		} else {
			delta = (Math.pow(b, 2) - (4 * a * c));
			if (delta < 0) {
				System.out.println("Não existe raiz real.");
			} else if (delta == 0) {
				System.out.println("Existe uma raiz real.");
				x1 = (-b + Math.sqrt(delta)) / 2 * a;
				System.out.println("x1 = " + x1);
			}else if (delta > 0) {
				System.out.println("Existe duas raízes reais.");
				x1 = (-b + Math.sqrt(delta)) / 2 * a;
				x2 = (-b - Math.sqrt(delta)) / 2 * a;
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	 
	}

}
