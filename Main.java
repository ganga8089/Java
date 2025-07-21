/*Author :Ganga
 * Date:21/07/2025
 * To print area of circle,rectangle,triangle,square using overloading*/

class AreaCalculator{
	public void area(double r) {
		double area=3.14*r*r;
		System.out.println("Area of circle: "+area);
	}
	public void area(double l, double b) {
		double area=l*b;
		System.out.println("Area of rectangle: "+area);
	}
	public void area(float b, float h) {
		float area=0.5f*b*h;
		System.out.println("Area of triangle: "+area);
	}
	public void area(int s) {
		int area=s*s;
		System.out.println("Area of square: "+area);
	}
}
public class Main {
	public static void main(String[] args) {
		AreaCalculator calc=new AreaCalculator();
		calc.area(5.5);
		calc.area(5.5,2.4);
		calc.area(5.5f,3.4f);
		calc.area(5);
		
	}
}
