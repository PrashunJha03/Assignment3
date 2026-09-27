package cdacac.com.Assignment3;

import java.util.Scanner;

public class SearchingElement {
	
	static int search(int arr[], int element) {
		for (int i = 0; i < arr.length; i++)
			if(arr[i] == element)
				return i;
		return -1;
		
	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements :");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter elements:");
		
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter search element");
		int element = sc.nextInt();
		int position = search(arr, element);
		
		if(position != -1) {
			System.out.println("Element Found.");
			System.out.println("Position : "+ position);	
		
		}
		else 
		{
			
			System.out.println("Element not found.");
		
		}
		
		sc.close();
	
	}
}
