/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 98*/
public class CaminhãoEx21 {

	private int codigoEstado, codigoCarga;
	private double pesoCargaTon, pesoCargaKg, precoCarga, precoImposto, valorTotalTransp;

	public void setCodigoEstado(int codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	public void setCodigoCarga(int codigoCarga) {
		this.codigoCarga = codigoCarga;
	}

	public void setPesoCargaTon(double pesoCargaTon) {
		this.pesoCargaTon = pesoCargaTon;
	}

	public double convertePrecoParaKg() {
		return pesoCargaKg = pesoCargaTon * 1000;
	}

	public double calculaPrecoCarga() {
		if (codigoCarga >= 10 && codigoCarga <= 20) {
			precoCarga = pesoCargaKg * 100;
		} else if (codigoCarga >= 21 && codigoCarga <= 30) {
			precoCarga = pesoCargaKg * 250;
		} else if (codigoCarga >= 31 && codigoCarga <= 40) {
			precoCarga = pesoCargaKg * 340;
		}
		return precoCarga;
	}

	public void calculaValorImposto() {
		switch (codigoEstado) {
		case 1:
			precoImposto = precoCarga * 0.35;
			System.out.println("Valor do Imposto: " + precoImposto);
			break;
		case 2:
			precoImposto = precoCarga * 0.25;
			System.out.println("Valor do Imposto: " + precoImposto);
			break;
		case 3:
			precoImposto = precoCarga * 0.15;
			System.out.println("Valor do Imposto: " + precoImposto);
			break;
		case 4:
			precoImposto = precoCarga * 0.05;
			System.out.println("Valor do Imposto: " + precoImposto);
			break;
		default:
			precoImposto = 0;
			break;
		}
	}

	public double calculaValorTotalTransp() {
		return valorTotalTransp = precoCarga + precoImposto;
	}

	public void imprimir() {
		System.out.println("Peso da carga em Kg: " + convertePrecoParaKg());
		System.out.println("Preço da carga: " + calculaPrecoCarga());
		System.out.println("Valor do Imposto: " + precoImposto);
		System.out.println("Valor total transportado: R$" + calculaValorTotalTransp());
	}

}
