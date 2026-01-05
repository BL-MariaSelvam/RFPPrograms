package Day5;

import java.util.Scanner;

public class QuotientRemTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numerator of a number");
		int numerator=sc.nextInt();
		System.out.println("Enter the denominator of a number");
		int denominator=sc.nextInt();
		
		if(denominator!=0) {
			int quotient=numerator/denominator;
			int remainder=numerator%denominator;
			System.out.println("The Quotient of a number division is "+quotient);
			System.out.println("The Remainder of a number division is "+remainder);
		}

	}

}
