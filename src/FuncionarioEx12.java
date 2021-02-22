/*Fundamentos da programa��o de computadores - Cap�tulo 4 Estrutura condicional - p�gina 87
12 - Fa�a um programa que receba o c�digo correspondente ao cargo de um funcion�rio e seu sal�rio atual
e mostre o cargo, o valor do aumento e seu novo sal�rio. Os cargos est�o na tabela a seguir.*/

public class FuncionarioEx12 {

	private double codigo, salarioAtual, valorAumento, novoSalario;

	

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}

	public void setSalarioAtual(double salarioAtual) {
		this.salarioAtual = salarioAtual;
	}

	public double calculaAumento(double percentual) {
		return valorAumento = salarioAtual * (percentual/100);
	}
	
	public double calculaNovoSalario() {
		return novoSalario = salarioAtual + valorAumento;
	}

	public void menu() {
		if (codigo == 1) {
			System.out.println("Cargo: Escritur�rio");
			System.out.println("Sal�rio atual R$" +salarioAtual);
			System.out.println("Valor do aumento: " + calculaAumento(50));
			System.out.println("Novo sal�rio: R$" + calculaNovoSalario());
		} else
		if (codigo == 2) {
			System.out.println("Cargo: Secret�rio");
			System.out.println("Sal�rio atual R$" +salarioAtual);
			System.out.println("Valor do aumento: " + calculaAumento(35));
			System.out.println("Novo sal�rio: R$" + calculaNovoSalario());
			
		} else
		if (codigo == 3) {
			System.out.println("Cargo: Caixa");
			System.out.println("Sal�rio atual R$" +salarioAtual);
			System.out.println("Valor do aumento: " + calculaAumento(20));
			System.out.println("Novo sal�rio: R$" + calculaNovoSalario());
		} else
		if (codigo == 4) {
			System.out.println("Cargo: Gerente");
			System.out.println("Sal�rio atual R$" +salarioAtual);
			System.out.println("Valor do aumento: " + calculaAumento(10));
			System.out.println("Novo sal�rio: R$" + calculaNovoSalario());
		} else
		if (codigo == 5) {
			System.out.println("Cargo: Gerente");
			System.out.println("Sal�rio atual R$" +salarioAtual);
			System.out.println("Diretor n�o possui aumento");
		}
		else {
			System.out.println("C�digo de cargo inv�lido.");
		}
	}
}
