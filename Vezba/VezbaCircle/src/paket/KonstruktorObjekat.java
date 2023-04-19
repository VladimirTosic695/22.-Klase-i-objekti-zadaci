package paket;

public class KonstruktorObjekat {

	public static void main(String[] args) {
		
		Circle ob = new Circle();
		Circle ob1 = new Circle(10);
		Circle ob2 = new Circle(ob1);
		
		System.out.println("Prvi objekat " + ob.area());
		System.out.println("Drugi objekat "+ob1.area());
		System.out.println("Treci objekat "+ob2.area());

	}

}
