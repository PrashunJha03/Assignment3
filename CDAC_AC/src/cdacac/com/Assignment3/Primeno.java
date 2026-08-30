package cdacac.com.Assignment3;

import java.util.Scanner;

public class Primeno {

	
	static void prime(int n) {
		for (int num = 2; num <= n; num++) {
			int count = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
				
			}
			if (count == 2)
				System.out.println(num);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = sc.nextInt();
		prime(n);
		sc.close();
	}

}
