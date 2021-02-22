/*Fundamentos da programação de computadores - Capítulo 4 Estrutura condicional - página 94*/
public class TrianguloEx18 {

	private int x, y, z;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void classificaTriangulo() {
		if (x < y + z && y < x + z && z < x + y) {
			if (x == y && y == z) {
				System.out.println("Triângulo Equilátero");
			} else if (x == y || x == z || y == z) {
				System.out.println("Triângulo Isóceles.");
			} else if(x != y && x != z && y != z) {
				System.out.println("Triângulo escaleno.");
			}
		} else {
			System.out.println("Essas medidas não formam um triângulo.");
		}
	}
}
