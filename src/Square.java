
public class Square implements Figure, Shape{

	int width;
	
	Square(int width){
		this.width = width;
	}
	
	@Override
	public double perimeter() {
        return 4*width;
    }
	
	@Override
	public double area() {
        return width*width;
    }
	
	@Override
	public void description() {
		System.out.println("Cuadrado de " + width + " por " + width );
		
	}
}
