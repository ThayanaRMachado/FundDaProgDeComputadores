/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 104*/
public class TrigonometriaEx25 {

	public int angulo, voltas;

	public void setAngulo(int angulo) {
		this.angulo = angulo;
	}
	
	public int calculaVoltasEAngulo() {
		if (angulo > 360 || angulo < 360) {
			voltas = angulo / 360;
			angulo = angulo % 360;
		} else {
			voltas = 0;
			if (angulo == 0 || angulo == 90 || angulo == -90 || angulo == 180 || angulo == -180 || angulo == -270) {
				System.out.println("Está em cima de algum dos eixos.");
			}
			if ((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360)) {
				System.out.println("1º Quadrante");
			}
			if ((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270)) {
				System.out.println("2º Quadrante");
			}
			if ((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) {
				System.out.println("3º Quadrante");
			}
			if ((angulo > 270 && angulo < 360) || (angulo < -0 && angulo > -90)) {
				System.out.println("4º Quadrante");
				System.out.println(Math.abs(voltas) + "volta(s) no sentido.");
				if (angulo < 0) {
					System.out.println(" horário");
				} else {
					System.out.println(" anti-horário");
				}
			}
		}
		return voltas;
	}
	
	public void imprimir() {
		System.out.println("Angulo: " + angulo);
		System.out.println("Voltas: " + calculaVoltasEAngulo());
	}
}
