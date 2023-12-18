package Pfp014_Assignment_1;

import java.util.Scanner;

public class UC2_EqualityOfTwoLines {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x value ");
		Integer x = sc.nextInt();
		System.out.println("Enter y value ");
		Integer y = sc.nextInt();
		if(x.equals(y))
		{ 
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
	}

}
