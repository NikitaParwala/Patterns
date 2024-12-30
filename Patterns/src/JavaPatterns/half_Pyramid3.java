package JavaPatterns;
import java.util.*;

public class half_Pyramid3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of row u wanted to print pattern : ");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int k=row; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*

  *
 **
***


*/