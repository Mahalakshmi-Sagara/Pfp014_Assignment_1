package Pfp014_Assignment_1;

import java.util.Scanner;

public class UC3_CompareTwoLines {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x value ");
		Integer x = sc.nextInt();
		System.out.println("Enter y value ");
		Integer y = sc.nextInt();
		if(x.compareTo(y)==0)
		{ 
			System.out.println("Same");
		}
		else if (x.compareTo(y)<0)
		{
			System.out.println("x is less than y");
		}
		else{
			System.out.println("x is greater then y");
		}

	}

}
