package JavaPatterns;
import java.util.*;

public class half_number_pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows");
		int row = sc.nextInt();
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}System.out.println();
		}

	}

}

/*

1
12
123
1234

*/