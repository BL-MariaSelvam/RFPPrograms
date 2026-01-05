package Operators;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1");
		double x=sc.nextDouble();
		System.out.println("Enter the number2");
		double y=sc.nextDouble();
		
		double distance=Math.sqrt((Math.pow(x, x))+(Math.pow(y, y)));
		System.out.println("The Euclidean distance is "+distance);
	}

}
