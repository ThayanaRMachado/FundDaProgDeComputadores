/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 87
12 - Faça um programa que receba o código correspondente ao cargo de um funcionário e seu salário atual
e mostre o cargo, o valor do aumento e seu novo salário. Os cargos estão na tabela a seguir.*/

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
			System.out.println("Cargo: Escriturário");
			System.out.println("Salário atual R$" +salarioAtual);
			System.out.println("Valor do aumento: " + calculaAumento(50));
			System.out.println("Novo salário: R$" + calculaNovoSalario());
		} else
		if (codigo == 2) {
			System.out.println("Cargo: Secretário");
			System.out.println("Salário atual R$" +salarioAtual);
			System.out.println("Valor do aumento: " + calculaAumento(35));
			System.out.println("Novo salário: R$" + calculaNovoSalario());
			
		} else
		if (codigo == 3) {
			System.out.println("Cargo: Caixa");
			System.out.println("Salário atual R$" +salarioAtual);
			System.out.println("Valor do aumento: " + calculaAumento(20));
			System.out.println("Novo salário: R$" + calculaNovoSalario());
		} else
		if (codigo == 4) {
			System.out.println("Cargo: Gerente");
			System.out.println("Salário atual R$" +salarioAtual);
			System.out.println("Valor do aumento: " + calculaAumento(10));
			System.out.println("Novo salário: R$" + calculaNovoSalario());
		} else
		if (codigo == 5) {
			System.out.println("Cargo: Gerente");
			System.out.println("Salário atual R$" +salarioAtual);
			System.out.println("Diretor não possui aumento");
		}
		else {
			System.out.println("Código de cargo inválido.");
		}
	}
}
