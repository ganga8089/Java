/*Author:Ganga
 * Date:08/08/25
 * Inheritance Demo
 */
class Book{
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
		public void displayDetails(){
			System.out.println("Title: "+title);
			System.out.println("Author: "+author);
			System.out.println("Price: "+price);
		}
}
class EBook extends Book{
	double fileSize;
	EBook(String title,String author,double price,double fileSize){
		super(title,author,price);
		this.fileSize=fileSize;
	}
	public void displayDetails(){
		super.displayDetails();
		System.out.println("File Size: "+fileSize);
	}
}
class PrintedBook extends Book{
	int numberOfPages;
	PrintedBook(String title,String author,double price,int numberOfPages){
		super(title,author,price);
		this.numberOfPages=numberOfPages;
	}
		public void displayDetails(){
			super.displayDetails();
			System.out.println("Number of Pages : "+numberOfPages);
		}
}
public class Inheritancedemo {
	public static void main(String[] args) {
		EBook ebook=new EBook("Title1","Author1",200.5,25.8);
		ebook.displayDetails();
		PrintedBook printedbook=new PrintedBook("Title2","Author2",290.5,800);
		printedbook.displayDetails();
	}
}
