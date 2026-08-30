package cdacac.com.Assignment3;
import java.util.Scanner;
public class SumOfDigits {
	
	static int sumofDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digits : ");
		int num = sc.nextInt();
		System.out.println("The Sum of the Digits is : "+sumofDigits(num));
		sc.close();
	}

}
