public class Main {
	
	public static void main(String[] args) {
		
		Circle c = new Circle(5.0);
		
		System.out.println("Raio: " + c.getRaio());
		System.out.println("Área: " + c.calcularArea());
		System.out.println("Perímetro: " + c.calcularPerimetro());
	} 
}