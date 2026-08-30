package cdacac.com.Assignment3;

import java.util.Scanner;

public class StudentMarksAnalysis {
	
	static double[] calmarks(int marks[]) {
		int total = 0;
		int highest = marks[0];
		int lowest = marks[0];
		
		for(int i = 0; i < marks.length; i++) {
			total = total + marks[i];
			if (marks[i] > highest)
				highest = marks[i];
			if (marks[i] < lowest) 
				lowest = marks[i];			
		}
		
		double avg = (double) total / marks.length;
		
		return new double[] { total, avg, highest, lowest };
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Students :");
		int n = sc.nextInt();
		
		int marks[] = new int [n];
		System.out.println("Enter marks :");
		
		for (int i = 0; i < n; i++)
			marks[i] = sc.nextInt();
		
		double result[] = calmarks(marks);
		
		System.out.println("Total= "+ result[0]);
		System.out.println("Average= "+ result[1]);
		System.out.println("Highest= "+ result[2]);
		System.out.println("Lowest= "+ result[3]);
		sc.close();
	}

}
