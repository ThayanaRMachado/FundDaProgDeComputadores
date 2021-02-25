/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 102*/
public class ProdutoEx24 {

	private double preco, valorAdicional, imposto, precoCusto, desconto, novoPreco;
	private char tipo, refrigeracao;

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public void setRefrigeracao(char refrigeracao) {
		this.refrigeracao = refrigeracao;
	}

	public double calculaValorAdicional() {
		if (refrigeracao == 'N') {
			if (tipo == 'A') {
				if (preco < 15) {
					valorAdicional = 2;
				} else {
					valorAdicional = 5;
				}
			}
			if (tipo == 'L') {
				if (preco < 10) {
					valorAdicional = 1.5;
				} else {
					valorAdicional = 2.5;
				}
			}
			if (tipo == 'V') {
				if (preco < 30) {
					valorAdicional = 3;
				} else {
					valorAdicional = 2.5;
				}
			}
		} else {
			if (tipo == 'A') {
				valorAdicional = 8;
			}
			if (tipo == 'L') {
				valorAdicional = 0;
			}
			if (tipo == 'V') {
				valorAdicional = 0;
			}
		}
		return valorAdicional;
	}
	
	public double calculaImposto() {
		if (preco < 25) {
			imposto = preco * 0.05;
		} else {
			imposto = preco * 0.08;
		}
		return imposto;
	}
	
	public double calculaPrecoCusto() {
		return precoCusto = preco + imposto;
	}
	
	public double calculaDesconto() {
		if (tipo != 'A' && refrigeracao != 'S') {
			desconto = 0.03;
		} else {
			desconto = 0;
		}
		return desconto;
	}
	
	public double calculaNovoPreco() {
		return novoPreco = precoCusto + valorAdicional - desconto;
	}
	
	public void classificacao() {
		if (novoPreco <= 50) {
			System.out.println("Barato");
		} else if (novoPreco < 100) {
			System.out.println("Normal");
		} else {
			System.out.println("Caro");
		}
	}
	
	public void imprimir() {
		System.out.println("Valor adicional: R$" + calculaValorAdicional());
		System.out.println("Imposto: R$" + calculaImposto());
		System.out.println("Preço de Custo: R$" + calculaPrecoCusto());
		System.out.println("Valor do Desconto: R$" + calculaDesconto());
		System.out.println("Novo preço: R$" + calculaNovoPreco());
		classificacao();
	}
}
