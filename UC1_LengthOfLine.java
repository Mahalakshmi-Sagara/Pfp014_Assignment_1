package Pfp014_Assignment_1;

import java.util.Scanner;

public class UC1_LengthOfLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter X1 value  ");
				int x1 = sc.nextInt();
				System.out.println("Enter y1 value  ");
				int y1 = sc.nextInt();
				System.out.println("Enter X2 value  ");
				int x2 = sc.nextInt();
				System.out.println("Enter y2 value  ");
				int y2 = sc.nextInt();
				double result = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
                System.out.println("Length of a line is " + result);
	}

}
