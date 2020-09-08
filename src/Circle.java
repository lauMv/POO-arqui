
public class Circle implements Figure, Shape{
	
	private double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    public double perimeter(){
        return 2*(Math.PI)*radius;
    }
    public double area(){
        return radius*radius*(Math.PI);
    }
    
    public void description() {
		System.out.println("Circulo de radio: " + radius);    	
    }
}
