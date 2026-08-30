package cdacac.com.Assignment3;
import java.util.Scanner;
public class MultiplicationTable {
	
	static int multiply(int n) {
			for(int i = 1; i <= 10; i++) {
				System.out.println(n+"x" + i + "="+ (n * i));
			}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. : ");
		int n = sc.nextInt();
		multiply(n);
		sc.close();
	}

}
