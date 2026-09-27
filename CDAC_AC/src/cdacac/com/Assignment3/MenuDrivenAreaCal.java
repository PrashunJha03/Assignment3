package cdacac.com.Assignment3;
import java.util.Scanner;
public class MenuDrivenAreaCal {

		static double circle(double r) {
			return 3.14 * r * r; 
			
		}
		
		static double rectangle(double l, double b)
	    {
			
			return l * b;
		
		}
	
		 static double triangle(double b, double h) 
		{
			
			 return 0.5 * b * h;
		
		}
		 
	
		 public static void main(String[] args) 
		{
		
			 Scanner sc = new Scanner(System.in);
			 System.out.println("1. Area of Circle ");
			 System.out.println("1. Area of Rectangle ");
			 System.out.println("1. Area of Triangle ");
			 
			 System.out.println("Enter your choice :");
			 int choice = sc.nextInt();
			 
			 switch (choice) {
			 
			 	case 1:
			 		System.out.println("Enter Radius :");
			 		double r = sc.nextDouble();
			 		
			 		System.out.println("Area of Circle = " + circle(r));
			 		break;
			 		
			 	case 2:
			 		System.out.println("Enter Length :");
			 		double l = sc.nextDouble();
			 		System.out.println("Enter Breadth :");
			 		double b = sc.nextDouble();
			 		
			 		System.out.println("Area of Rectangle = " + rectangle(l , b));
			 		break;
			 		
			 	case 3:
			 		System.out.println("Enter Base :");
			 		double base = sc.nextDouble();
			 		System.out.println("Enter Height :");
			 		double h = sc.nextDouble();
			 		
			 		System.out.println("Area of Triangle = " + triangle(base, h));
			 		break;
			 		
			 		default:
			 			System.out.println("Invalid choice");
			 
			 }
			 
			sc.close();

	}
}
