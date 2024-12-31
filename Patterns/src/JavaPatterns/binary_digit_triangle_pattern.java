package JavaPatterns;

public class binary_digit_triangle_pattern {


	public static void main(String[] args) {
		int num = 0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				num = i + j;
				if(num % 2==0) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
			}System.out.println();
		}

	}

}


/*

1
0 1
1 0 1
0 1 0 1


*/