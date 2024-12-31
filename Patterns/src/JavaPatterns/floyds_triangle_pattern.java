package JavaPatterns;
import java.util.*;

public class floyds_triangle_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows to print : ");
		int row = sc.nextInt();
		// TODO Auto-generated method stub
		int n = 0;
		for(int i=1; i<=row; i++) {
			for( int j=1; j<=i; j++) {
				n++;
				System.out.print(n+" ");
			}System.out.println();
		}

	}

}


/*

1
2 3
4 5 6
7 8 9 10

*/