/*Author:Ganga
 * Date:19/08/2025
 * Java program to read n numbers using array and find the largest
 */
package demo;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		int [] array=new int[n];
		System.out.println("Enter numbers:");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Array:");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		int largest=array[0];
		for (int i=0;i<n;i++) {
			if (array[i]>largest) {
				largest=array[i];
			}
		}
		System.out.println("Largest:"+largest);
	}
}
