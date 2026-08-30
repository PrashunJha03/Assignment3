package cdacac.com.Assignment3;

import java.util.Scanner;

public class CountEvenOdd {
	
	static int[] countEvenOdd(int arr[]) {
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i = 0; i < arr.length; i++)
			
			if (arr[i] % 2 == 0)
			evenCount++;
			else
			oddCount++;
		
		return new int[] {evenCount, oddCount};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements :");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter elements :");
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int result[] = countEvenOdd(arr);
		
		System.out.println("Even Elements = "+result[0]);
		System.out.println("Odd Elements = "+result[1]);
		
		sc.close();
	}

}
