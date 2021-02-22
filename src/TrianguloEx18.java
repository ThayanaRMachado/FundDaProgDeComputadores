/*Fundamentos da programa��o de computadores - Cap�tulo 4 Estrutura condicional - p�gina 94*/
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
				System.out.println("Tri�ngulo Equil�tero");
			} else if (x == y || x == z || y == z) {
				System.out.println("Tri�ngulo Is�celes.");
			} else if(x != y && x != z && y != z) {
				System.out.println("Tri�ngulo escaleno.");
			}
		} else {
			System.out.println("Essas medidas n�o formam um tri�ngulo.");
		}
	}
}
