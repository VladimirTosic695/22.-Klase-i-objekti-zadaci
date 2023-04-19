package paket;

public class Circle {
	
	private double radius;
	
	Circle (){
		radius = 0.0;
	}
	
	Circle (double r){
		radius = r;
	}
	Circle (Circle ob){
		radius = ob.radius;
	}
	
	public double area() {
		return 3.14 * radius * radius;
	}

}
