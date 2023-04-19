package vlada;

public class Prikaz {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(c1);
		
		System.out.println("Povrsina kruga: "+c2.area());

	}

}
