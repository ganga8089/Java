class Student{
	int rollNumber;
	String name;
	String dept;
	//Creating Constructor with no arguments
	Student(){
		rollNumber=2;
		name="Test1";
		dept="dept1";
	}
	//Creating Constructor with one arguments
	Student(int rollNumber){
		this.rollNumber=rollNumber;
	}
	//Creating Constructor with two arguments
	Student(int rollNumber,String name){
		this.rollNumber=rollNumber;
		this.name=name;
	}
	public void displayDetails() {
		System.out.println("RollNumber: "+rollNumber);
		System.out.println("Name: "+name);
		System.out.println("Department": "+dept);
		}
}
public class ConsructorDemo {
	public static void main(String[] args) {
		Student stud=new Student();
		stud.displayDetails();
		Student stud1=new Student();
		stud1.displayDetails(2);
		
	}

}
