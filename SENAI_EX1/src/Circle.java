public class Circle {
	
	// Atributo
	private double raio;
	
	// Construtor
	public Circle(double raio) {
		this.raio = raio;
	}
	// Método para calcular a área do círculo
	public double calcularArea() {
		return 3.14 * raio * raio;
	}
	// Método para calcular o perímetro do círculo
	public double calcularPerimetro() {
		return 2 * 3.14 * raio;
	}
	// Método opcional: obter o raio
	public double getRaio() {
		return raio;
	}
	// Método opcional: alterar o raio
	public void setRaio(double raio) {
		this.raio = raio;
	}
}