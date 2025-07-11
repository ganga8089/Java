/*Author:Ganga
 * Date:11/07/2025
 * Java program to check whether the given number is palindrome or not*/
package demo;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int rem,rev=0;
		int newnum=num;
		while (num >0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;}
	if (newnum==rev) {
		System.out.println("The given number "+newnum +" is Palindrome");
	}
	else {
		System.out.println("The given number "+newnum+ " is not Palindrome");
	}
}
}