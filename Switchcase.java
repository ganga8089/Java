/*Author:Ganga
 * Date:11/07/2025
 * Grade System using switch case*/
package demo;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		Scanner sc=new Scanner( System.in);
		System.out.println("Enter grade");
		String grade=sc.nextLine();
	    switch (grade) {
		case "S":
			System.out.println("Outstanding performance");
			break;
		case "A+":
			System.out.println("Excellent performance");
			break;
		case "A":
			System.out.println("Very Good performance");
			break;
		case "B+":
			System.out.println("Good performance");
			break;
		case "B":
			System.out.println("Above Average performance");
			break;
		case "C":
			System.out.println("Average performance");
			break;
		default:
			System.out.println("Invalid Grade");
			break;
		}
	    sc.close();
	}
}
