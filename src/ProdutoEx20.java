/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 96*/
public class ProdutoEx20 {

	private int codigo, codigoPais;
	private double pesoKg, pesoGramas, precoTotal, precoGramas, valorImposto, valorTotal;

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}

	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}

	public double calculaPesoGramas() {
		return pesoGramas = pesoKg * 1000;
	}

	public void calculaPrecoPorGr() {
		if (codigo >= 1 && codigo <= 4) {
			precoGramas = 10;
		} else if(codigo >= 5 && codigo <= 7) {
			precoGramas = 25;
		} else if(codigo >= 8 && codigo <= 10) {
			precoGramas = 35;
		}
	}
	
	public double calculaPrecoTotal() {
		return precoTotal = pesoGramas * precoGramas;
	}

	public double calculaImposto() {
		if (codigoPais == 1) {
			valorImposto = 0; 
		} else if (codigoPais == 2) {
			valorImposto = precoTotal * (15/100);
		} else if (codigoPais == 3) {
			valorImposto = precoTotal * (25/100);
		}
		return valorImposto;
	}
	
	public double calculValorTotal() {
		return valorTotal = precoTotal + valorImposto;
	}
	
	public void imprimir() {
		System.out.println("Peso em Gramas: " + calculaPesoGramas());
		System.out.println("Preço total do produto: R$" + calculaPrecoTotal());
		System.out.println("Valor do imposto: R$" + calculaImposto());
		System.out.println("Valor total: R$" + calculValorTotal());
	}
}
