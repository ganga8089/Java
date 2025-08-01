/*Name:Ganga
 * Date:01/08/2025
 * Static Method demo
 */
package demo;

class Student{
	String name;
	int rollNumber;
	static int studentCount=0;
	Student(String name,int rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
		studentCount++;
	}
	public static void displayStudentCount() {
		System.out.println("Number of Students entered:"+studentCount);
	}
}

public class Std {
	public static void main(String[] args) {
		Student stud1= new Student("Name1",1);
		Student stud2=new Student("Name2",2);
		Student stud3=new Student("Name3",3);
		Student.displayStudentCount();
		
	}
}
