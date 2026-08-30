package cdacac.com.Assignment3;

import java.util.Scanner;

public class findMaxandMin {
	
	static int[] maxmin(int arr[]) {
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max= arr[i]; 
			if (arr[i] < min) 
				min = arr[i];
		}
		return new int[] {max, min};
		
	}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements :");
			int n = sc.nextInt();
		
			int arr[] = new int[n];
			System.out.println("Enter " + n + " numbers");
			
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			
			int	result[] = maxmin(arr);
			
			System.out.println("Maximum = "+result[0]);
			System.out.println("Minimum = "+result[1]);
			sc.close();
		}

}
