package JavaPatterns;
import java.util.*;

public class half_number_pyramid2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int row = sc.nextInt();
		for(int i=row;i>=1;i--) {
			for(int j=1; j<=i;j++) {
				System.out.print(j);
			}System.out.println();
		}
	}

}


/* 

12345
1234
123
12
1

*/