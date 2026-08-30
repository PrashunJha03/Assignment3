package cdacac.com.Assignment3;
import java.util.Scanner;
public class RevNum {
	
	static int reverseNum(int n) {
		int rev = 0;
		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		
		}
		return rev;
			
	
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		System.out.println("The number is : " + num);
		System.out.println("The Reversed no. is : "+reverseNum(num));
		sc.close();
	}

}
