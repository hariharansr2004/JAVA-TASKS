package Arrays;

public class Patterns {
	static void pattern1(int n) {
		for (int i=1;i<=n;i++){ 
			for(int j=1;j<=n;j++){
				System.out.print("*");
			} 
			System.out.println();
		}

	}

	static void pattern2(int n) {
		for (int i=1;i<=n;i++){ 
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			} 
			System.out.println();
		}

	}
	static void pattern3(int n) {
		for (int i=1;i<=n;i++){ // 1<=5
			for(int j=1;j<=n-i+1;j++){ //<=5-1
				System.out.print("* ");
			} 
			System.out.println();
		}

	}
	
	static void pattern4(int n) {
		for (int i=1;i<=n;i++){ 
			for(int j=1;j<=i;j++){
				System.out.print(j);
			} 
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patterns a=new Patterns();
		a.pattern4(5);
		//a.pattern2(5);

	}

}
