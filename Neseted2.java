package progtask;

import java.util.Scanner;

public class Neseted2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Favourite Actress from the below List:");
		System.out.println("1.Nayan 2.Trisha 3.Keerthy");
		Scanner obj=new Scanner(System.in);
		String n=obj.nextLine();
		switch(n) {
		case "Nayan":
			System.out.println("Select Hero ");
			System.out.println("1.Vijay 2.Ajith 3.VJS");
			String movie=obj.nextLine();
			switch(movie) {
			case "Vijay":
				System.out.println("Paired Movie:Bigil");
				break;
			case "Rajini":
				System.out.println("Paired Movie:Viswasam");
				break;
			case "Surya":
				System.out.println("Paired Movie:KRK");
				break;		
			default:
				System.out.println("Enter Valid Hero Name");
			}break;
		case "Trisha":
			System.out.println("Select Hero ");
			System.out.println("1.Vijay 2.Ajith 3.VJS");
			String movie2=obj.nextLine();
			switch(movie2) {
			case "Vijay":
				System.out.println("Paired Movie: Leo");
				break;
			case "Rajini":
				System.out.println("Paired Movie: Mangatha");
				break;
			case "Surya":
				System.out.println("Paired Movie: 96");
				break;		
			default:
				System.out.println("Enter Valid Hero Name");
			}break;
		case "Samantha":
			System.out.println("Select Hero ");
			System.out.println("1.Vijay 2.Dhanush 3.VJS");
			String movie3=obj.nextLine();
			switch(movie3) {
			case "Vijay":
				System.out.println("Paired Movie: Theri");
				break;
			case "Rajini":
				System.out.println("Paired Movie: Thanga Magan");
				break;
			case "VJS":
				System.out.println("Paired Movie: KRK");
				break;		
			default:
				System.out.println("Enter Valid Hero Name");
			}break;
		
		default:
			System.out.println("Enter Valid Actress Name");
			
			
		}
		
	}

}
