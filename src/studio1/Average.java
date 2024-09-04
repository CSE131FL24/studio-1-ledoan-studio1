package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("n1:");
		int n1 = in.nextInt();
		System.out.print("n2:");
		int n2 = in.nextInt();
		System.out.print("The first of two integers to be averaged?");
		double average = n1 + n2;
		double result = average / 2;
		System.out.print("Average of " + n1 + " and " + n2 + " is " + result);

	}

}
