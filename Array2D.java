/*Author:Ganga
 * Date:19/08/2025
 * Java program to read a matrix and print its transpose
 */
package demo;
import java.util.Scanner;
public class Array2D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter size of matrix:");
		int n=sc.nextInt();
		int [] [] matrix=new int[n][n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
		System.out.println();
		}
		System.out.println();
		System.out.println("Transpose:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[j][i]+"\t");
			}
		System.out.println();
		}
	}
}
