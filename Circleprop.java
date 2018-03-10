package Circle;

public class Circleprop {
     // instance variables
	int radius;
	final static float pi = 3.14f;
	
  // default constructor
	public Circleprop(){
		
	}

// parameterized constructor	
	public Circleprop(int radius) {
		super();
		this.radius = radius;
	}
	
// static method	
	public static float getRadius(){
	
		return pi;
	}
	
// non static or instance
	public float circumference(int radius) {
	float circum = (float) (2*3.14*radius);
	return circum;
	}
	
// method overloading
	public float circumference(int radius, float pi) {
		float circum = (float) (2*pi*radius);
		return circum;
		}	
	// non static or instance
		public float area(int radius) {
		float area = (float) (3.14*radius*radius);
		return area;
		}
		
	// method overloading
		public float area(int radius, float pi) {
			float area = (float) (pi*radius*radius);
			return area;
			}	
}

