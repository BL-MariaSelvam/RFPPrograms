package Operators;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter the coefficient a");
		a=sc.nextDouble();
		System.out.println("Enter the coefficient b");
		b=sc.nextDouble();
		System.out.println("Enter the coefficient c");
		c=sc.nextDouble();
		
		if(a==0) {
			System.out.println("Coefficient cannot be zero");
		}
		double discriment=b*b-(4*a*c);
		if(discriment>0) {
			double root1=(-b+Math.sqrt(discriment))/(2*a);
			double root2=(-b-Math.sqrt(discriment))/(2*a);
			System.out.println("root1: "+root1);
			System.out.println("root2: "+root2);
		}
		else if(discriment==0) {
			double root=-b/(2*a);
			System.out.println("root "+root);
		}
		else {
			double realpart=-b/(2*a);
			double imaginarypart=Math.sqrt(-discriment)/(2*a);
			System.out.println("realpart: "+realpart);
			System.out.println("imaginarypart: "+imaginarypart);
			
		}
	}

}
