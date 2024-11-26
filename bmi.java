package progtask;

import java.util.Scanner;

public class bmi {
	 
	static float newmethod(float height,float weight){
		
		float bmi=weight/(height*height);
		return bmi;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your height");
		float height=obj.nextFloat();
		System.out.println("Enter your weight");
		float weight=obj.nextFloat();
		System.out.println(newmethod(height,weight));

	}

};
