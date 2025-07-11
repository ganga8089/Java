/*Author:Ganga
 * Date:11/07/2025
 * Java program to print even numbers up to n using for loop*/
package demo;

import java.util.Scanner;

public class Evenno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int lim=sc.nextInt();
		for(int i=1;i<=lim;i++) {
			if (i%2==0) {
				System.out.print(i+"\t");
			}
		}
	}
}
