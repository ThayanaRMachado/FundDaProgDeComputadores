/*Fundamentos da programa��o de computadores - Cap�tulo 4 Estrutura condicional - p�gina 89
13 - Fa�a um programa que apresente o menu a seguir, permita ao usu�rio escolher a op��o desejada, receba
os dados necess�rios para executar a opera��o e mostre o resultado. Verifique a possibilidade de
op��o inv�lida e n�o se preocupe com restri��es, como sal�rio negativo*/
public class FuncionarioEx13 {

	private int codigo;
	private double salario, percentualImposto, valorImposto, novoSalario;

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calculaImposto(double percentual) {
		return valorImposto = salario * (percentual / 100);
	}

	public double calculaAumento(double aumento) {
		return novoSalario = salario + aumento;
	}

	public void menu() {
		if (codigo == 1) {
			if (salario < 500) {
				System.out.println("Valor do Imposto: R$" + calculaImposto(5));
			} else if (salario >= 500 & salario <= 850) {
				System.out.println("Valor do Imposto: R$" + calculaImposto(10));
			} else if (salario > 850) {
				System.out.println("Valor do Imposto: R$" + calculaImposto(15));
			}
		} else if (codigo == 2) {
			if (salario > 1500) {
				System.out.println("Novo sal�rio: R$" + calculaAumento(25));
			} else if (salario >= 750 & salario <= 1500) {
				System.out.println("Novo sal�rio: R$" + calculaAumento(50));
			} else if (salario >= 450 & salario < 750) {
				System.out.println("Novo sal�rio: R$" + calculaAumento(75));
			} else if (salario < 450) {
				System.out.println("Novo sal�rio: R$" + calculaAumento(100));
			}
		} else if (codigo == 3) {
			if (salario <= 700) {
				System.out.println("Mal remunerado.");
			} else if (salario > 700) {
				System.out.println("Bem remunerado.");
			}
		} else {
			System.out.println("Op��o inv�lida");
		}
	}
}
