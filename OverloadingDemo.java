/*Author :Ganga
 * Date:21/07/2025
 * Overloading*/
class Calculator{
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("Sum: "+sum);
	}
	public void add(int a, int b,int c) {
		int sum=a+b+c;
		System.out.println("Sum: "+sum);
	}
	public void add(double a, double b) {
		double sum=a+b;
		System.out.println("Sum: "+sum);
	}
	public void add(String a,int b) {
		String sum=a+b;
		System.out.println("Concatenation: "+sum);
		
	}
}
public class OverloadingDemo {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(6,5);
		calculator.add(6,5,4);
		calculator.add(6.5,5.5);
		calculator.add("Hai",5);
		
	}
}
