package progtask;
import java.util.*;

public class palindrome {
	 
	public  String palop(String s){
		String reverse="";
		int n=s.length();
		for(int i=n-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		if (s.equals(reverse)) {
			return "Palindrome";
		}
		else 
		{
			return "Not";
		}
		
		
	}

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		palindrome pal=new palindrome();
		System.out.println(pal.palop(s));
		
	}
}
	
