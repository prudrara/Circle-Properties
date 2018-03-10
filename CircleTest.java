package Circle;

public class CircleTest {
	
	public static void main(String[] args) {
		
		Circleprop next = new Circleprop(5);
		// next.radius = 5;
		next.circumference(5);
		System.out.println("the radius: " + next.radius);
		System.out.println("the circumference of non static circle: " + next.circumference(5));
		System.out.println("the area of non static circle: " + next.area(5));
		Circleprop next2 = new Circleprop(23);
		// next2.radius = 23;
		next2.circumference(23, (float) 3.14);
		System.out.println("the radius: " + next2.radius);
		System.out.println("the circumference of method overloading circle: " + next2.circumference(23, (float) 3.14));
		System.out.println("the area of method overloading circle: " + next2.area(23, (float) 3.14));
	}
	

}
