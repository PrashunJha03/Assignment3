package cdacac.com.Assignment3;
import java.util.Scanner;
public class SimpleCalculator {
		
	static int calculate(int n1, int n2, char op) {
		switch (op) {
		
			case '+':
			return n1 + n2;
			
			case '-':
			return n1 -n2;
			
			case '*':
			return n1 * n2;
		
			case '/':
			return n1 / n2;
		
			case '%':
			return n1 % n2;
		
			default :
				return 0;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no. ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second no. ");
		int num2 = sc.nextInt();
		System.out.println("Choose the operation (+, -, *, /, %)" );
		char op = sc.next().charAt(0); 
		int result = calculate(num1 , num2, op);
		System.out.println("Result : "+result);
		sc.close();
	}

}
