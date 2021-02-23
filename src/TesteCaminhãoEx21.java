import java.util.Scanner;

public class TesteCaminh�oEx21 {

	public static void main(String[] args) {
		
		Caminh�oEx21 caminhao = new Caminh�oEx21();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o c�digo do Estado de origem da carga (Entre 1 e 5).");
		caminhao.setCodigoEstado(entrada.nextInt());
		
		System.out.println("Informe o peso da carga em toneladas.");
		caminhao.setPesoCargaTon(entrada.nextInt());
		
		System.out.println("Informe o c�digo da carga (Entre 10 e 40).");
		caminhao.setCodigoCarga(entrada.nextInt());
		
		caminhao.convertePrecoParaKg();
		caminhao.calculaPrecoCarga();
		caminhao.calculaValorImposto();
		caminhao.calculaValorTotalTransp();
		caminhao.imprimir();
	}
}
