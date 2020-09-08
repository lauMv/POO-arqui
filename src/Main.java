
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure cuadrado = new Square(4);
		Figure circulo = new Circle(10);
		System.out.println("Class Figure");
		System.out.println("area cuadrado: ");
		System.out.println(cuadrado.area());
		circulo.perimeter();
		
		System.out.println("Class Shape");
		Shape cuadrado1 = new Square(5);
		cuadrado1.description();
	}
}
