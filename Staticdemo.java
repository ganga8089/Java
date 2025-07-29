package demo;
class Student{
	String name;
	static int studentCount=0;
	Student(String name) {
		this.name = name;
		studentCount++;
	}
	public void getStudentCount(){
		System.out.println(name);
		System.out.println(studentCount);
	}
}

public class Staticdemo {
	public static void main(String[] args) {
		Student student1=new Student("test1");
		student1.getStudentCount();
		Student student2=new Student("test2");
		student2.getStudentCount();
	}
}
