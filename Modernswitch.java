/*Author:Ganga
 * Date:11/07/2025
 * Grade System using Modern switch case*/
package demo;

import java.util.Scanner;

public class Modernswitch {
	public static void main(String[] args) {
		Scanner sc=new Scanner( System.in);
		System.out.println("Enter grade");
		String grade=sc.nextLine();
	    String result =switch (grade) {
	    case "S" -> "Outstanding performance";
	    case "A+" -> "Excellent performance";
	    case "A" -> "Very Good performance";
	    case "B+" -> "Good performance";
	    default -> "Invalid Grade";
	    };
	    System.out.println("Grade:" + grade);
	    System.out.println("Result:" + result);
}
}
