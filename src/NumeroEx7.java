//Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 81
/*07 - Faça um programa que receba quatro valores: I, A, B e C. Desses valores, I é inteiro e positivo, A, B e
C são reais. Escreva os números A, B e C obedecendo à tabela a seguir.
Suponha que o valor digitado para I seja sempre um valor válido, ou seja, 1, 2 ou 3, e que os números
digitados sejam diferentes um do outro.*/
public class NumeroEx7 {

	private int i, a, b, c;

	public void setI(int i) {
		this.i = i;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public void ordena() {
		if (i == 1) {
			if (a < b & a < c) {
				if (b < c) {
					System.out.println("Ordem crescente: "+ a + "-" + b + "-" + c);
				}
				if (b > c) {
					System.out.println("Ordem crescente: "+ a + "-"  + c + "-" + b);
				}
			}
			if (b < a & b < c) {
				if (a < c) {
					System.out.println("Ordem crescente: "+ b + "-" + a +"-" + c);
				}
				if (a > c) {
					System.out.println("Ordem crescente: "+ b + "-" + c+ "-" + a);
				}
			}
			if (c < a & c < b) {
				if (a < b) {
					System.out.println("Ordem crescente: "+ c + "-" + a + "-" + "b");
				}
				if (a > b) {
					System.out.println("Ordem crescente: "+ c + "-" + b + "-" + a);
				}
			}
		}
		if (i == 2) {
			if (a > b & a > c) { //a
				if (b > c) {
					System.out.println("Ordem decrescente: "+ a + "-" + b + "-" + c);
				}
				if (b > c) {
					System.out.println("Ordem decrescente: "+ a + "-" + c + "-" + b);
				}
			}
			if (b > a & b > c) {
				if (a > c) {
					System.out.println("Ordem decrescente: "+ b + "-" + a + "-" + c);
				}
				if (a < c) {
					System.out.println("Ordem decrescente: "+ b + "-" + c + "-" + a);
				}
			}
			if (c > a & c > b) {
				if (a > b) {
					System.out.println("Ordem decrescente: "+ c + "-" + a + "-" + b);
				}
				if (a < b) {
					System.out.println("Ordem decrescente: "+ c + "-" + b + "-" + a);
				}
			}
		}
		if (i ==3) {
			if (a > b & a > c) {
				System.out.println("A ordem desejada é: "+ b + "-" + a + "-" + c);
			}
			if (b > a & b > c) {
				System.out.println("A ordem desejada é: "+ a + "-" + b + "-" + c);
			}
			if (c > a & c > b) {
				System.out.println("A ordem desejada é: "+ a + "-" + c + "-" + b);
			}
		}
	}
}
