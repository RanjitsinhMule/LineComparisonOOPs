package Com.bridgelabz.LCOOPs;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
System.out.println("Welcome to The Line Comparison Computation Program");
		
		Scanner scanner = new Scanner(System.in);              // scanner class to take the input from user
		System.out.print("Enter x1 of First Point: ");
		int x1 = scanner.nextInt();
		System.out.print("Enter y1 of First Point: ");
		int y1 = scanner.nextInt();
		System.out.print("Enter x2 of Second Point: ");
		int x2 = scanner.nextInt();
		System.out.print("Enter y2 of Second Point: ");
		int y2 = scanner.nextInt();
		
		System.out.print("Enter x1 of Third Point: ");
		int p1 = scanner.nextInt();
		System.out.print("Enter y1 of Third Point: ");
		int q1 = scanner.nextInt();
		System.out.print("Enter x2 of Forth Point: ");
		int p2 = scanner.nextInt();
		System.out.print("Enter y2 of Forth Point: ");
		int q2 = scanner.nextInt();
		scanner.close();

		Double lenghtOfLine1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));      // calculate the length of first line
		Double lengthOfLine2 = Math.sqrt(Math.pow(p2-p1, 2) + Math.pow(q2-q1, 2));     // calculate the length of second line
		
		System.out.printf("Length of First Line is : %.2f %n", lenghtOfLine1);               // %.2f %n to print only two digit after point
		System.out.printf("length of Second Line : %.2f %n", lengthOfLine2);           // %.2f %n to print only two digit after point
		
		boolean ans = lenghtOfLine1.equals(lengthOfLine2);                             // return true if equal unless false
		if(ans)
			System.out.println("Both Lines are Equal");
		else
			System.out.println("Both Lines are not Equal");
  }
}
