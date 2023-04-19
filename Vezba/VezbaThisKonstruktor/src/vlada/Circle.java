package vlada;

public class Circle {
	
	private double radius;
	
	Circle(){
		radius = 0.0;
	}
	Circle (double rad){
		this.radius = rad;
	}
	
	public double area () {
		return 3.14 * radius * radius;
	}

}
