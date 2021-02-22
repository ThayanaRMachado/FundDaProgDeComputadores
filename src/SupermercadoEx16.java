/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 93*/
public class SupermercadoEx16 {

	private double precoAtual, vendaMediaMensal, novoPreco;

	public void setPrecoAtual(double precoAtual) {
		this.precoAtual = precoAtual;
	}

	public void setVendaMediaMensal(double vendaMediaMensal) {
		this.vendaMediaMensal = vendaMediaMensal;
	}

	public void setNovoPreco(double novoPreco) {
		this.novoPreco = novoPreco;
	}
	
	public double reajustarPrecos() {
		if (vendaMediaMensal < 500 || precoAtual < 30) {
			novoPreco = precoAtual + (precoAtual * (10/100));
		} else if((vendaMediaMensal >= 500 && vendaMediaMensal < 1200) || (precoAtual >= 30 & precoAtual < 80)) {
			novoPreco = precoAtual + (precoAtual * (15/100));
		} else if(vendaMediaMensal >= 12000 || precoAtual >= 80) {
			novoPreco = precoAtual - (precoAtual * (20/100));
		}
		return novoPreco;
	}
	
	public void imprimir() {
		System.out.println("Novo preço: R$" + reajustarPrecos());
	}
}
