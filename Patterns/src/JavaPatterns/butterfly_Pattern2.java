package JavaPatterns;

public class butterfly_Pattern2 {

	public static void main(String[] args) {
		int n = 4;
		
		//TO Print below Pattern
				 
		 	/*
			 
			*------*
			**----**
			***--***
			********
			
			*/
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j = 2*(n-i); j>=1; j--) {
				System.out.print(" ");
			}
			for(int j = 1 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		//To pint below pattern
		
		/* 
		 
		  ********
		  ***--***
		  **----**
		  *------*
		 
		 */
		for(int i = n; i>=1; i--) {
			for(int j = i; j>=1; j--) {
				System.out.print("*");
			}
			
			for(int j = 2*(n-i); j>=1; j--) {
				System.out.print(" ");
			}
			
			for(int j = i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
