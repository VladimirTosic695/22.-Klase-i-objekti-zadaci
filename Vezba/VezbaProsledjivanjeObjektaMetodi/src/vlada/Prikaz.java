package vlada;

public class Prikaz {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(20);
		
		calcArea(c1);
		
	}
		
		public static void calcArea(Circle b) {
			System.out.println("Povrsina kruga: "+b.area());
		}

	

}
