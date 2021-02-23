import java.util.Scanner;

public class TesteCaminhãoEx21 {

	public static void main(String[] args) {
		
		CaminhãoEx21 caminhao = new CaminhãoEx21();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o código do Estado de origem da carga (Entre 1 e 5).");
		caminhao.setCodigoEstado(entrada.nextInt());
		
		System.out.println("Informe o peso da carga em toneladas.");
		caminhao.setPesoCargaTon(entrada.nextInt());
		
		System.out.println("Informe o código da carga (Entre 10 e 40).");
		caminhao.setCodigoCarga(entrada.nextInt());
		
		caminhao.convertePrecoParaKg();
		caminhao.calculaPrecoCarga();
		caminhao.calculaValorImposto();
		caminhao.calculaValorTotalTransp();
		caminhao.imprimir();
	}
}
