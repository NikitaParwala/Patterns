package JavaPatterns;

public class hollow_Sqaure_pattern {

	public static void main(String[] args) {
		int row = 4, col = 5;
		for(int r = 1; r<=row; r++) {
			for(int c = 1; c<=col; c++) {
				if(r==1||r==row||c==1||c==col) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
	}

} 

/*

*****
*   *
*   *
*****

*/